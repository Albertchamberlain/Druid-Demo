package com.Amos.demo.jdbc;

import com.Amos.utils.DataSourceUtils;

import java.sql.*;

public class JDBCDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = DataSourceUtils.getConnection();

        String sql = "update  tb_user set name = ? , sex = ? where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,"马武");
        preparedStatement.setString(2,"Male");
        preparedStatement.setInt(3,5);

        int i = preparedStatement.executeUpdate();

        System.out.println("i = " + i);

        DataSourceUtils.close(preparedStatement,connection);



    }
}
