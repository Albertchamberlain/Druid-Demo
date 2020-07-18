package com.Amos.demo;

import com.Amos.utils.BaseDao;
import com.Amos.demo.entity.user;

public class NameDao {
    public static void main(String[] args) {
        BaseDao Namedao = new BaseDao();
        String sql = "select * from tb_user where id = ? ";
        Object[] params = {6};
        user user = (user) Namedao.findOne(sql,user.class,params);
        System.out.println("user = " + user);


    }
}
