package com.example.DAO;

import com.example.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    
    Connection con;
    PreparedStatement st;
    
    public void CadastrarUsuario(UsuarioDTO objUsuarioDTO) throws ClassNotFoundException, SQLException {
        
        String sql = "insert into usuario (nome, email, senha) values(?,?,?)";
        con = new ConexaoDAO().conexaoBD();
                
        try {
            st = con.prepareStatement(sql);
            st.setString(1, objUsuarioDTO.getNome());
            st.setString(2, objUsuarioDTO.getEmail());
            st.setString(3, objUsuarioDTO.getSenha());
            
            st.execute();
            st.close();
            
        } catch (SQLException e) {
            
        }
    }
}
