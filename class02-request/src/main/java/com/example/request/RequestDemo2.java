package com.example.request;
import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/request2")
public class RequestDemo2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getParameterNames();

        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            System.out.println(name+":"+value);
        }
        String header = req.getHeader("header");
        if(header.contains("Edg")){
            System.out.println("Edg");
        }
//        else if(header.contains("Chrome")){
//            System.out.println("Chrome");
//        }
    }
}
