package com.example.request;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;

import java.io.IOException;
@WebServlet("/request6")
public class RequestDemo6 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request6 ±ª«Î«Û");
        response.getWriter().println("request6");
        request.setAttribute("msg", "hellow");

        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("msg", "hellow");
    }
}
