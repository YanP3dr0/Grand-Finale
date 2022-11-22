<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Despesas | SmartMoney</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/css/despesas.css">

</head>
<body>
    <%@ include file="menu.jsp" %>
    <main class="comtainer">
          <section class="container">
            <div class="content">
                <div class="titulo_Principal">
                    Despesas
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
                        <c:forEach items="${despesas}" var="p">
                          <tr>
                            <td class="coluna1_">${p.classificacao}</td>
                            <td class="coluna2_">${p.valorDebito}</td>
                            <td> <a href="despesa?codigo=${p.codigo}&acao=exclui"><button class="button-excluir">
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
