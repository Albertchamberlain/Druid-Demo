package com.itheima.demo;

import com.itheima.demo.entity.user;
import com.itheima.utils.BaseDao;

import java.util.List;

public class NameDao2 {
    public static void main(String[] args) {
        BaseDao Names = new BaseDao();
        String sql = " select * from tb_user";
        List list = Names.findList(sql, user.class);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("i = " + list.get(i));
        }
    }
}
