package com.itheima.demo.dbutils;

import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import java.sql.SQLException;

public class DbUtilsDemo5 {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql  = "select count(*) from tb_user ";
        long  count = queryRunner.query(sql, new ScalarHandler<>());
        System.out.println("count = " + count);
    }
}
