package com.Amos.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(name = "RegisterServlet",urlPatterns = "/register")
public class comitheimaservlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Hello Tom");
    }
}
