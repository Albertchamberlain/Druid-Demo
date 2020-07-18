package com.itheima.demo.dbutils;

import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class DbUtilsDemo2 {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        String sql  = "update tb_user set name = ? where name = ?";

        Object[] params = {"Hibox","Amos"};
        int update = queryRunner.update(sql, params);
        System.out.println("update = " + update);
    }
}
