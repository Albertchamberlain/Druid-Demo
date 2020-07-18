package com.Amos.demo.jdbc;

import java.sql.*;

public class JDBCDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

        String sql = "delete from tb_user where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,2);

        int i = preparedStatement.executeUpdate();
        System.out.println("i = " + i);
        preparedStatement.close();
        connection.close();

    }
}
