package com.Amos.demo.jdbc;

import java.sql.*;

public class JDBCDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

        String sql = "select * from tb_user ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);


        ResultSet rs = preparedStatement.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getObject(1) + "\t" + rs.getObject(2) + "\t" + rs.getObject(3) + "\t" + rs.getObject(4));
        }

        preparedStatement.close();
        rs.close();
        connection.close();
    }
}
