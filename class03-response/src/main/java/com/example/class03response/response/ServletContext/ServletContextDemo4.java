package com.example.class03response.response.ServletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servletcontextdemo4")
public class ServletContextDemo4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        String aPath = servletContext.getRealPath("/a.txt");
        System.out.println("a.txt 文件地址"+aPath);

        String bPath = servletContext.getRealPath("/b.txt");
        System.out.println("b.txt 文件地址"+bPath);
    }
}
