package com.example.class03response.response.Response;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/responseType")
public class ResponseDemo03 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        switch (type) {
            case "img":
                getImage(request, response);
                break;
            case "pdf":
                getPDF(request, response);
                break;
            case "zip":
                getZip(request, response);
                break;
            case "json":
                getJson(request, response);
                break;
            default:
                break;
        }
    }
    private void getImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpg");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath + "image/Test.jpg");
        InputStream in = Files.newInputStream(file.toPath());
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();
    }

    private void getPDF(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/pdf");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath + "pdf/123.pdf");
        InputStream in = Files.newInputStream(file.toPath());
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();
    }

    private void getZip(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/zip");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath + "Zip/Zip_1.rar");
        InputStream in = Files.newInputStream(file.toPath());
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();
    }
    private void getJson(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath + "Json/_container.json");
        InputStream in = Files.newInputStream(file.toPath());
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();
    }
}
