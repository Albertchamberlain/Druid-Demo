package com.Amos.demo.jdbc;


import com.Amos.utils.DataSourceUtils;


import java.sql.Connection;
import java.sql.PreparedStatement;


public class DruidDemo1 {

    public static void main(String[] args) throws Exception {


        Connection connection = DataSourceUtils.getConnection();
        String sql = "delete from tb_user where id = ? ";


        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,5);

        int i = preparedStatement.executeUpdate();
        System.out.println("i = " + i);


       DataSourceUtils.close(preparedStatement,connection);
    }
}
