package com.example.jakartaeeolamundo;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<h2>Estamos estudando servlet</h2>");

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        ServletConfig servletConfig = getServletConfig();
        out.println(servletConfig.getInitParameter("name"));
        //ServletContext servletContext = getServletContext();
        //out.println(servletContext.getInitParameter("name"));
    }

    public void destroy() {
    }
}