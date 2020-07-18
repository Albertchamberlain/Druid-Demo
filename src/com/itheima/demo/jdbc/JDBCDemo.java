package com.itheima.demo.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Amos
 */
public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        String sql = "insert into tb_user values(?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,5);
        preparedStatement.setString(2,"马六");
        preparedStatement.setString(3,"女");
        preparedStatement.setInt(4,18);

        int i = preparedStatement.executeUpdate();
        System.out.println("The table :"+i);

        preparedStatement.close();
        connection.close();
    }

}
