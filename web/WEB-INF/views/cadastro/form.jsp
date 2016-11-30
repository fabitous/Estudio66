<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Estudio 66 - Cadastro de clientes</title>
        <style>
            h1 {color:#009900;}
            label {color:#696969}
            body {background-color: #EFECF0}
            #form_cadastro {width: 20%; margin-left: 40%;}
        </style>
    </head>
    <body>
        <h1 class="text-center">Cadastro de clientes</h1>
        <form class="form-group" action="/ProjetoE66/cadastro" method="POST">
          <div class="form-group" id="form_cadastro">
            <div class="form-group">
                <label>Nome do cliente *</label>
                <input type="text" class="form-control" name="nome" required/>
            </div>
            <div class="form-group">
                <label>CPF *</label>
                <input type="text" class="form-control" name="cpf" required/>
            </div>
            <div class="form-group">
                <label >Email *</label>
                <input type="email" class="form-control" name="email" required/>
            </div>
            <div class="form-group">
                <label>Celular *</label>
                <input type="text" class="form-control" name="celular" required/>
            </div>
            <div class="form-group">
                <label>telefone</label>
                <input type="text" class="form-control" name="telefone"/>
            </div>
            <div class="form-group">
                <label>Skype</label>
                <input type="text" class="form-control" name="skype"/>
            </div>
            <div class="form-group">
                <label>Username *</label>
                <input type="text" class="form-control" name="username"/>
            </div>
            <div class="form-group">
                <label>Password *</label>
                <input type="password" class="form-control" name="password"/>
            </div>
              <p>* preenchimento obrigatório</p>
            <button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
          </div>
        </form>
    </body>
</html>