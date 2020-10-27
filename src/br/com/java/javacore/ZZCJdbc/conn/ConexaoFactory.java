package br.com.java.javacore.ZZCJdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class ConexaoFactory {
    //java.sql = Connection, Statement, Result Set
    //DriverManager
    public static Connection getConection() {
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JdbcRowSet getRowSetConection() {
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            return jdbcRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CachedRowSet getRowSetConectionCache() {
        String url = "jdbc:mysql://localhost:3306/agencia?relaxAutoCommit=true";
        String user = "root";
        String password = "";
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            return cachedRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(JdbcRowSet jrs) {
        try {
            if (jrs != null)
                jrs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void close(Connection conection) {
        try {
            if (conection != null)
                conection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conection, Statement stmt) {
        close(conection);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void close(Connection conection, Statement stmt, ResultSet rs) {
       close(conection,stmt);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
