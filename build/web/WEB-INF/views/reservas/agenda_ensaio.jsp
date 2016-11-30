<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudio 66</title>
        <style>
            h1 {color:#009900;}
            body {background-color: #EFECF0}
            #grid {
                width: 20%;
                margin-left: 40%
            }
        </style>
    </head>
    <body>
       <div id="grid"> 
        <h1>Sala de ensaio</h1>
        <table class="table-striped">
            <tr>
                <td><b>Horários disponíveis</b></td>
            </tr>
            <tr>
                 <td>Dia</td>
                 <td>Horario</td>
                 <td>Reserve</td>
            </tr>
            <form class="form-group" action="/ProjetoE66/opcoes_ensaio" method="POST">
             <c:forEach items="${agenda}" var="datas">
                <tr>
                    <td>${datas.dia}</td>
                    <td>${datas.horario}</td>
                    <td><button type="submit" class="btn btn-success btn-small" name="escolha" value="dia: ${datas.dia} horario: ${datas.horario}">Reservar</button></td>
                </tr>
             </c:forEach>
            </form>
        </table>
       </div>
    </body>
</html>
