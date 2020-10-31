package br.com.java.javacore.ZZCJdbc.db;

import br.com.java.javacore.ZZCJdbc.classes.Comprador;
import br.com.java.javacore.ZZCJdbc.classes.MyRowSetListener;
import br.com.java.javacore.ZZCJdbc.conn.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDbOld {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "')";
        Connection conn = ConexaoFactory.getConection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void saveTransaction() throws SQLException {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`, `nome`) VALUES ('TESTE1', 'TESTE1')";
        String sql2 = "INSERT INTO `agencia`.`comprador`(`cpf`, `nome`) VALUES ('TESTE2', 'TESTE2')";
        String sql3 = "INSERT INTO `agencia`.`comprador`(`cpf`, `nome`) VALUES ('TESTE3', 'TESTE3')";
        Connection conn = ConexaoFactory.getConection();
        Savepoint savePoint = null;
        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            savePoint = conn.setSavepoint("One");
          //  conn.releaseSavepoint();
            stmt.executeUpdate(sql2);
            if(true)
                throw new SQLException();
            stmt.executeUpdate(sql3);
            conn.commit();
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback(savePoint);
            conn.commit();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id`='" + comprador.getId() + "'";
        Connection conn = ConexaoFactory.getConection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= '" + comprador.getCpf() + "', `nome`='" + comprador.getNome() + "' WHERE `id`='" + comprador.getId() + "'";
        Connection conn = ConexaoFactory.getConection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
       // String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ?, `nome`= ? WHERE `id`= ? ";
        String sql = "SELECT * from comprador WHERE id = ?";
        JdbcRowSet jdbcRowSet = ConexaoFactory.getRowSetConection();
        jdbcRowSet.addRowSetListener(new MyRowSetListener());
        try {
            jdbcRowSet.setCommand(sql);
           // jdbcRowSet.setString(1, comprador.getCpf());
           // jdbcRowSet.setString(2, comprador.getNome());
            jdbcRowSet.setInt(1, comprador.getId());
            jdbcRowSet.execute();
            jdbcRowSet.next();
            jdbcRowSet.updateString("nome", "WILLIAM");
            jdbcRowSet.updateRow();
            ConexaoFactory.close(jdbcRowSet);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateRowSetCached(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "SELECT * from comprador WHERE id = ?";
        CachedRowSet cachedRowSet = ConexaoFactory.getRowSetConectionCache();
        try {
            cachedRowSet.setCommand(sql);
            cachedRowSet.setInt(1, comprador.getId());
            cachedRowSet.execute();
            cachedRowSet.next();
            cachedRowSet.updateString("nome", "JAHPA NOIS");
            cachedRowSet.updateRow();
            cachedRowSet.acceptChanges();
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updatePreparedStatement(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ?, `nome`= ? WHERE `id`= ? ";
        Connection conn = ConexaoFactory.getConection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            System.out.println(ps.executeUpdate());
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConection();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
//               System.out.println(rs.getInt("id"));
//               System.out.println(rs.getString("nome"));
//               System.out.println(rs.getString("cpf"));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static List<Comprador> selectAByName(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador WHERE nome LIKE '%" + nome + "%'";
        Connection conn = ConexaoFactory.getConection();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
//               System.out.println(rs.getInt("id"));
//               System.out.println(rs.getString("nome"));
//               System.out.println(rs.getString("cpf"));
            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static List<Comprador> selectAByNameRowSet(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador WHERE nome LIKE ?";
        JdbcRowSet jdbcRowSet = ConexaoFactory.getRowSetConection();
        jdbcRowSet.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jdbcRowSet.setCommand(sql);
            //PreparedStatement ps = conn.prepareStatement(sql);
            jdbcRowSet.setString(1,"%"+nome+"%");
            jdbcRowSet.execute();
            while (jdbcRowSet.next()) {
                compradorList.add(new Comprador(jdbcRowSet.getInt("id"), jdbcRowSet.getString("cpf"), jdbcRowSet.getString("nome")));

            }
            ConexaoFactory.close(jdbcRowSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static List<Comprador> selectAByNamePreparedStatement(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador WHERE nome LIKE ?";
        Connection conn = ConexaoFactory.getConection();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"%"+nome+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            }
            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static List<Comprador> selectAByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_GetCompradorPorNome`(?)";
        Connection conn = ConexaoFactory.getConection();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1,"%"+nome+"%");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            }
            ConexaoFactory.close(conn, cs, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void selectMetaDados() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConection();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdeColunas = rsmd.getColumnCount();
            System.out.println("Quantidade de colunas: " + qtdeColunas);

            for (int i = 1; i < qtdeColunas; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome Coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho Coluna: " + rsmd.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConection();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e tambem suporta CONCUR_UPDATABLE");
                }
            }

            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e tambem suporta CONCUR_UPDATABLE");
                }
            }

            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("e tambem suporta CONCUR_UPDATABLE");
                }
            }

            ConexaoFactory.close(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testPipeScroll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConection();
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.last()) {
                System.out.println("Ultima Linha: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("Numero da Ultima linha:" + rs.getRow());
            }
            System.out.println("Retornou para primeinha linha " + rs.first());
            System.out.println("Primeira linha:" + rs.getRow());

            rs.absolute(4);
            System.out.println("Linha 4: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            rs.relative(-1);
            System.out.println("Linha 3: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            System.out.println(rs.isLast());
            System.out.println(rs.isFirst());
            rs.afterLast();
            System.out.println("-------------------------");
            while(rs.previous()){
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            }

            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateNomesToLowerCase() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConection();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                rs.updateRow();
//                if(rs.rowUpdated()){
//                    System.out.println("Linha atualizada");
//                }
            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf","999.999.999.99");
            rs.insertRow();
            rs.moveToCurrentRow();
           // System.out.println(nome);
            System.out.println(rs.getString("nome") + " row" + rs.getRow());

            rs.absolute(7);
            rs.deleteRow();
            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
