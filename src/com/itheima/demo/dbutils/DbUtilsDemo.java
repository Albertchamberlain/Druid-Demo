package com.itheima.demo.dbutils;

import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class DbUtilsDemo {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        String sql =  "insert into tb_user(name,sex) values (?,?)";
        Object [] params = {"Amos","Femal"};
        int update = queryRunner.update(sql, params);
        System.out.println("update = " + update);
    }
}
