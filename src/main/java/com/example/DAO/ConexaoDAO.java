package com.example.DAO;

import java.sql.*;

public class ConexaoDAO {

    public static Connection conexaoBD() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        //String url = "jdbc:mysql://localhost:3306/cadastro_usuarios?user=root&password=soma@28072021";
        //String username = "root";
        //String password = "soma@28072021";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro_usuarios", "root", "soma@28072021");
        //Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery("show databases;");
        //System.out.println(rs);

        return con;

    }
}
