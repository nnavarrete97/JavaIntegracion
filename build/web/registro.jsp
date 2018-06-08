<%-- 
    Document   : registro
    Created on : Jun 8, 2018, 12:44:33 AM
    Author     : nicomscr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Veranum - Registro</title>
        <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
    </head>
    <body>
        
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="${tipoMensaje}">
                        <p>${msj}</p>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class=""><h1>Registro de Usuarios</h1></div>
                </div>
            </div>
        
            <div class="row">
                <div class="col-md-12">
                    <form action="ServletUsuario" method="post">
                        <div class="form-group">
                            <label>Username</label>
                            <input type="text" name="txtUsername" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" name="txtPassword" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Registrar" class="btn btn-primary">
                            <input type="reset" value="Limpiar" class="btn btn-danger">
                        </div>
                    </form>
                </div>
            </div>
            
        
        
        </div>
        
        
        
    </body>
</html>
