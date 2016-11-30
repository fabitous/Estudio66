<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Estudio 66</title>
        <style>
            h1,label {color:#009900;}
            body {background-color: #EFECF0;}
            #login {
                width: 10%;
                margin-left: 45%;
                margin-top: 3%;
            }
        </style>    
    </head>
    <body>
        <form action="/ProjetoE66/logar" method="POST">
           <div id="login" class="text-center">
            <div>
                <label>Username</label>
                <input type="text" class="form-control" name="username" required/>
            </div>
            <div>
                <label>Password</label>
                <input type="password" class="form-control" name="password" required/>
            </div></br>
            <div class="text-center"><button class="btn btn-success btn-lg" type="submit">Entrar</button></div>
            <div>${mensagem}</div>
           </div>
        </form>
    </body>
</html>
