<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Investimentos | SmartMoney</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/css/investimentos.css">

</head>
<body>
    <%@ include file="menu.jsp" %>
    <main class="comtainer">
          <section class="container">
            <div class="content">
                <div class="titulo_Principal">
                    Investimentos
                </div>
                <c:if test="${not empty msg }">
            		<div class="alert alert-success">${msg}</div>
        		</c:if>
                <div class="table_container">
                    
                    <table class="teste">
                        <tr>
                          <th class="coluna1">Data</th>
                          <th class="coluna2">Aplicação</th>
                          <th class="coluna3">Resgate</th>
                          <th class="coluna4">Rendimento</th>
                          <th class="coluna5">IR</th>
                          <th class="coluna6">IOF</th>
                        </tr>
                        <c:forEach items="${investimentos}" var="p">
                          <tr>
                            <td class="coluna1_">${p.dataTransacao}</td>
                            <td class="coluna2_">${p.valorAplicacao}</td>
                            <td class="coluna3_">${p.valorResgaste}</td>
                            <td class="coluna4_">${p.valorRendimento}</td>
                            <td class="coluna5_">${p.valorIR}</td>
                            <td class="coluna6_">${p.valorIOF}</td>
                            <td> <a href="investimento?codigo=${p.codigoInvestimento}&acao=exclui"><button class="button-excluir">
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