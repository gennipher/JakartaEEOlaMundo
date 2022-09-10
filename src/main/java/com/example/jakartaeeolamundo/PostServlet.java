package com.example.jakartaeeolamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "postServlet", value = "/postServlet")
public class PostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        String nome;
        String email;
        String senha;

        out.println("<html><body>");
        out.println("<h1>Cadastro realizado:</h1>");
        out.println("<p>Nome: "+ request.getParameter("nome") +"</p>");
        out.println("<p>E-mail: "+ request.getParameter("email") +"</p>");
        out.println("<p>Senha: "+ request.getParameter("senha") +"</p>");
        out.println("</body></html>");

    }
}
