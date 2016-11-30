<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Estúdio 66</title>
        <style>
            p {color:#797979;font-style: italic}
            h1 {color:#009900;}
            label {color:#797979}
            body {background-color: #EFECF0}
            #form_agenda {width: 30%; margin-left: 35%;}
        </style>
    </head>
    <body>
        <h1 class="text-center">Reserva da sala de estudo</h1>
        <form class="form-group" action="/ProjetoE66/estudo" method="POST">
          <div class="form-group" id="form_agenda">
            <div class="form-group">
                <label>Reserva</label>
                <input type="text" class="form-control" name="dia" value="${escolha}" readonly/>
            </div>
            <div class="form-group">
                <label>Pessoas</label>
                <input type="text" class="form-control" name="pessoas"/>
                <p>quatidade de pessoas no ensaio (limitado a 4 pessoas no máximo)</p>
            </div>
            <div class="form-group">
                <label>Alugar Amplificadores?</label>
                <input type="text" class="form-control" name="amplificadores"/>
                <p>informe o tipo e a quantidade</p>
            </div>
            <div class="form-group">
                <label>Alugar Microfones?</label>
                <input type="text" class="form-control" name="microfones"/>
                <p>informe o tipo e a quantidade</p>
            </div>
            <div class="form-group">
                <label>Café</label>
                <input type="text" class="form-control" name="cafe"/>
                <p>café preto ou com leite ou chá, fatia de bolo, croassaint e água (informe a quantidade)</p>
            </div>                            
            <div class="form-group">
                <label>Nome do cliente</label>
                <input type="text" class="form-control" name="sala" value="${usuariologado}" readonly/>
            </div>
              <button type="submit" class="btn btn-danger btn-lg">Reservar</button>
           </div>
        </form>
    </body>
</html>