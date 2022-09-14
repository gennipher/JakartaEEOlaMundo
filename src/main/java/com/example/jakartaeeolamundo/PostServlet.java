package com.example.jakartaeeolamundo;

import com.example.DAO.ConexaoDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet(name = "postServlet", value = "/postServlet")
public class PostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            Connection con = ConexaoDAO.conexaoBD();
            PreparedStatement st = con.prepareStatement("INSERT INTO usuario (nome, email, senha) VALUES ('jenn', 'jen@email.com', 'senha')");
            st.executeUpdate();
            st.close();
            con.close();

            response.setContentType("text/html");

            // Hello
            PrintWriter out = response.getWriter();

            /*String nome;
            String email;
            String senha;

            out.println("<html><body>");
            out.println("<h1>Cadastro realizado:</h1>");
            out.println("<p>Nome: "+ request.getParameter("nome") +"</p>");
            out.println("<p>E-mail: "+ request.getParameter("email") +"</p>");
            out.println("<p>Senha: "+ request.getParameter("senha") +"</p>");
            out.println("</body></html>");*/

        }catch(Exception e) {
            e.printStackTrace();
        }


    }
}
