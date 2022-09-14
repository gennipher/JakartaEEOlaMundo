
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UsuarioDTO objUsuarioDTO = new UsuarioDTO;
            objUsuarioDTO.setNome(request.getParameter("nome"));
            
            UsuarioDAO
        %>
    </body>
</html>
