package com.example.class03response.response.ServletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servletcontextdemo1")
public class ServletContextDemo1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        String fileName = "hello.pdf";
        String mimeType = servletContext.getMimeType(fileName);
        System.out.println(mimeType);
    }
}