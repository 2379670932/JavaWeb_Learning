package com.example.request;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@WebServlet("/request4")
public class RequestDemo4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("username"+username);

        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println("nobby"+hobby);

        }
        System.out.println("==================");
        System.out.println("获取所有请求的参数名称");
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println("参数名称"+name);
            String values = request.getParameter(name);
            System.out.println("参数值"+values);
        }
        System.out.println("=================");
        System.out.println("获取所有请求的map集合");
        Map<String,String[]> paramterMap = request.getParameterMap();
        Set<String> keySet = paramterMap.keySet();
        for (String name : keySet ) {
            System.out.println("参数名称"+name);
            String[] values = paramterMap.get(name);
            for (String value : values) {
                System.out.println(value);
            }
        }

    }
}
