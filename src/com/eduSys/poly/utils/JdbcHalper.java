/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.poly.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO T560
 */
public class JdbcHalper {

    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "QLDT_DAM";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "123456";

    // Hàm getConnection kết nối với cơ sở dữ liệu
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustServerCertificate=true;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Kết nối thành công");
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace(System.out);
        }

        return null;
    }

    // Truy vấn, Hàm này thực hiện các câu lệnh truy vấn 
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustServerCertificate=true;";
        Connection conn = DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        // PreparedStatement
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

    ;
    // Hàm update trả về 1 là thực hiện câu lệnh truy vấn thành công thành công
    public static int update(String sql, Object... args) throws SQLException {
        try {
            PreparedStatement stmt = JdbcHalper.getStmt(sql, args);
            try {
                System.out.println("Thành công");
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //  Hàm này thực hiện truy vấn trả về 1 tập kết quả ResultSet
    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JdbcHalper.getStmt(sql, args);
        return stmt.executeQuery();

    }
    // Trả về đối tượng, 1 giá trị duy nhất

    public static Object value(String sql, Object... args) throws SQLException {
        try {
            // Thực hiện câu lệnh truy vấn và trả về 1 tập kết quả ResultSet
            ResultSet resultSet = JdbcHalper.query(sql, args);
            if (resultSet.next()) {
                return resultSet.getObject(0);
            }
            // Đóng kết nối
            resultSet.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
