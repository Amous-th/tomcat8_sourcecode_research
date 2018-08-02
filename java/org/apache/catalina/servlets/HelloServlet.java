package org.apache.catalina.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("hello world");
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("===========HelloServlet init===========");
    }
}