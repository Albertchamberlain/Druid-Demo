package com.Amos.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet2", urlPatterns = "/re")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("访问到 post 方法");

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("访问到 get 方法");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);

        // 往request域中丢一个集合数据
        request.setAttribute("list",list);

        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
