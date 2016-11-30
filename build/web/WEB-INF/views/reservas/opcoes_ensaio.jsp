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
        <h1 class="text-center">Reserva da sala de ensaio</h1>
        <form class="form-group" action="/ProjetoE66/ensaio" method="POST">
          <div class="form-group" id="form_agenda">
            <div class="form-group">
                <label>Reserva</label>
                <input type="text" class="form-control" name="dia" value="${escolha}" readonly/>
            </div>
            <div class="form-group">
                <label>Pessoas*</label>
                <input type="text" class="form-control" name="pessoas" required/>
                <p>quatidade de pessoas no ensaio (limitado a 8 pessoas no máximo)</p>
            </div>
            <div class="form-group">
                <label>Alugar Amplificadores?*</label>
                <input type="text" class="form-control" name="amplificadores" required/>
                <p>informe o tipo e a quantidade</p>
            </div>
            <div class="form-group">
                <label>Alugar Microfones?*</label>
                <input type="text" class="form-control" name="microfones" required/>
                <p>informe o tipo e a quantidade</p>
            </div>
            <div class="form-group">
                <label>Alugar mesa de som?</label>
                <input type="text" class="form-control" name="mesa"/>
                <p>informar a quantidade de canais</p>
            </div>                            
            <div class="form-group">
                <label>Nome do cliente</label>
                <input type="text" class="form-control" name="sala" value="${usuariologado}" readonly/>
            </div>
              <p>* preenchimento obrigatório</p>
              <button type="submit" class="btn btn-danger btn-lg">Reservar</button>
           </div>
        </form>
    </body>
</html>
