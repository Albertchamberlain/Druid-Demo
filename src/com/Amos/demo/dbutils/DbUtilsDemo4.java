package com.Amos.demo.dbutils;
import com.Amos.demo.entity.user;
import com.Amos.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;
public class DbUtilsDemo4 {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql  = "select * from tb_user ";
        List<user> users = queryRunner.query(sql, new BeanListHandler<>(user.class));
        for (int i = 0; i <users.size() ; i++) {
            user user = users.get(i);
            System.out.println("user = " + user);
        }
    }
}
