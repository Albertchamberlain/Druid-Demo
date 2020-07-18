package com.itheima.demo.dbutils;

import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class DbUtilsDemo1 {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        String sql  =  "delete from tb_user where id = ?";

        Object[] params = {5};

        int update = queryRunner.update(sql,params);
        System.out.println("update = " + update);

    }
}
