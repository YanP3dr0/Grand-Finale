<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SmartMoney - Seja um de Nossos Clientes</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="./resources/css/home.css">
</head>
<body>
    <header>
        <div class="container__header">
            <h1 class="logo"><img src="./resources/img/Smart_Money-removebg-preview.png" width="300px" alt=""></h1>
        </div>
    </header>
    <main class="container__main">
       <section class="box">
           <section class="texts">
            <h2><p id="chamada">Bem-vindo ao SmartMoney!, ${user}</p></h2>
            <p class="pitch__1">Queremos te ajudar nas suas finanças!</p>
            <p class="pitch__2">Caso já tenha uma conta, clique em <strong>Entrar</strong>, senão, clique em <strong>Criar Conta</strong></p>
           </section>
           <section class="buttons">
            <a href="cadastro" rel="_next" target="_self"><input type="button" class="login__btn" value="buscar usuario"></a>
           </section>
       </section> 
    </main>
    <footer class="rodape">
        <p>&copy; SmartMoney | Todos os Direitos Reservados - 2022</p>
    </footer>
</body>
</html>