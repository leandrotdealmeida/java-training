package br.com.java.javacore.ZZCJdbc.db;

import br.com.java.javacore.ZZCJdbc.classes.Carro;
import br.com.java.javacore.ZZCJdbc.classes.Comprador;
import br.com.java.javacore.ZZCJdbc.conn.ConexaoFactory;
import br.com.java.javacore.ZZCJdbc.interfaces.CarroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAOImpl implements CarroDAO {

    @Override
    public void save(Carro carro) {
        String sql = "INSERT INTO `agencia`.`carro`(`nome`, `placa`, `compradorId`) VALUES ( ?, ?, ?)";

        try (Connection conn = ConexaoFactory.getConection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getComprador().getId());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Carro carro) {
        if (carro == null || carro.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`carro` WHERE `id`= ? ";

        try (Connection conn = ConexaoFactory.getConection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Carro carro) {
        if (carro == null || carro.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`carro` SET `nome`= ?, `placa`= ? WHERE `id`= ? ";
        try (Connection conn = ConexaoFactory.getConection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getId());
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Carro> selectAll() {
        String sql = "SELECT id, nome, placa, compradorId FROM agencia.carro";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Comprador c = CompradorDAO.selectAById(rs.getInt("compradorid"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), c ));
            }
            return carroList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Carro> selectAByName(String nome) {
        String sql = "SELECT id, nome, placa, compradorid FROM agencia.carro WHERE nome LIKE ?";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comprador c = CompradorDAO.selectAById(rs.getInt("compradorid"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), c));
            }
            ConexaoFactory.close(conn, ps, rs);
            return carroList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
