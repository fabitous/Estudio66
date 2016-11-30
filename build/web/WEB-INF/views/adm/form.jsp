<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Estudio 66 - ADM</title>
        <style>
            h1 {color:#009900;}
            h2 {color:#00BB00;}
            label {color:#696969}
            p {font-style: italic}
            body {background-color: #EFECF0}
            #form_agenda {width: 20%; margin-left: 40%;}
        </style>
    </head>
    <body>
        <h1 class="text-center">Cadastro de agenda</h1>
        <form class="form-group" action="/ProjetoE66/agenda" method="POST">
          <div class="form-group" id="form_agenda">
            <div class="form-group">
                <label>Dia:</label>
                <input type="text" class="form-control" name="dia" required/>
                <p>no formato dd-mm-aaaa</p>
            </div>
            <div class="form-group">
                <label>Hora:</label>
                <input type="text" class="form-control" name="horario" required/>
                <p>no formato hh:mm</p>
            </div>
            <h2>Registrar disponibilidade de:</h2></br>
          </div>
            <div class="col-sm-5"></div>
            <div class="col-sm-1">
                <button type="submit" name="sala" value="en" class="btn btn-primary">ensaio</button>
            </div>
            <div class="col-sm-1">
                <button type="submit" name="sala" value="es" class="btn btn-primary">estudo</button>
            </div>
            <div class="col-sm-1">
                <button type="submit" name="sala" value="gr" class="btn btn-primary">gravação</button>
            </div>
            <div class="col-sm-4"></div>
        </form>
    </body>
</html>