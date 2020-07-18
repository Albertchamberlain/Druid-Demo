package com.Amos.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/Register")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("fangwen dopost method");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str =  "test EL！！！！！！";
        //往request域中丢入一个键为msg 值为 test EL！！！！！！ 的数据
        request.setAttribute("message",str);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
