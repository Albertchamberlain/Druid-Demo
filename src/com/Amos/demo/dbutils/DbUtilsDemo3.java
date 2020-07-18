package com.Amos.demo.dbutils;

import com.Amos.demo.entity.user;
import com.Amos.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class DbUtilsDemo3 {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        String sql  = "select * from tb_user where  name = ?";
        Object[] params = {"张三"};
        ResultSetHandler rsh = new BeanHandler(user.class);
       user user = (user) queryRunner.query(sql, rsh, params);
        System.out.println("user = " + user.getNAME());
    }
}
