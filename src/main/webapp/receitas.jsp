<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Receitas | SmartMoney</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/css/receitas.css">

</head>
<body>
    <%@ include file="menu.jsp" %>
    <main class="comtainer">
          <section class="container">
            <div class="content">
                <div class="titulo_Principal">
                    Receitas
                </div>
                <c:if test="${not empty msg }">
            		<div class="alert alert-success">${msg}</div>
        		</c:if>
                <div class="table_container">
                    
                    <table class="teste">
                        <tr>
                          <th class="coluna1">Descrição</th>
                          <th class="coluna2">Valor</th>
                        </tr>
                        <c:forEach items="${receitas}" var="p">
                          <tr>
                            <td class="coluna1_">${p.nomeClassificacao}</td>
                            <td class="coluna2_">${p.valorCredito}</td>
                            <td> <a href="receita?codigo=${p.codigoReceita}&acao=exclui"><button class="button-excluir">
                                Excluir
                               </button></a></td>
                          </tr>
                        </c:forEach>
                      </table>
                </div>
            </div>
          </section>
    </main>
</body>
</html>
