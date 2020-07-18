package com.Amos.demo.jdbc;

import java.sql.*;

public class JDBCDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

        String sql  = "select NAME from td_user where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,5);

        ResultSet rs  = preparedStatement.executeQuery(sql);

        while(rs.next()){
            System.out.println("rs = " + rs.getString(1));
        }

    }
}
