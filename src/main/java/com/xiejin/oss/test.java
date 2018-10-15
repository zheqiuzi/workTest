package com.xiejin.oss;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/myController")
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
//        System.out.print(req.getParameter("name"));
        System.out.print("m");
        Writer w;
        w=response.getWriter();
        w.append("hello").flush();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response){
        System.out.print(req.getParameter("name"));
    }
}
