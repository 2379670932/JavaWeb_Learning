package com.example.request;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;

import java.io.IOException;
@WebServlet("/request7")
public class RequestDemo7 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("attribute"+request.getAttribute("msg"));
//        request.removeAttribute("msg");
        ServletContext servletContext = request.getServletContext();
        String info = String.valueOf(servletContext.getAttribute("info"));
        System.out.println("info"+info);
    }
}
