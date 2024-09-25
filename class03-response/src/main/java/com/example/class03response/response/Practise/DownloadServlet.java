package com.example.class03response.response.Practise;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取文件名
        String filename = req.getParameter("filename");
        //获取serve 对象
        ServletContext context = req.getServletContext();
        String realPath = context.getRealPath("/image/"+filename);
        FileInputStream fileInputStream = new FileInputStream(realPath);
        String mineType = context.getMimeType(filename);
        resp.setContentType(mineType);

        resp.setHeader("Content-disposition", "attachment;filename"+filename);
        ServletOutputStream outputStream = resp.getOutputStream();
        byte[] buffer = new byte[1024*8];
        int len = 0;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        fileInputStream.close();

    }
}
