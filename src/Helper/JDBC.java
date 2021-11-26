/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class JDBC {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost\\WORK-GROUP\\SQLEXPRESS:1433;databaseName=QuanLyTraSua2";
    static String user = "sa";
    static String pass = "111";

    //Nap Driver
//    static {
//        try {
//            Class.forName(driver);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    //Xjdbc.GETSTMT()
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt;

        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql); //PROC
        } else {
            stmt = conn.prepareStatement(sql); //SQL
        }

        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    //Xjdbc.QUERY()
    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JDBC.getStmt(sql, args);
        return stmt.executeQuery();
    }

    //Xjdbc.VALUE()
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JDBC.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Xjdbc.UPDATE()
    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = JDBC.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
