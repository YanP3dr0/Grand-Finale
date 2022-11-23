<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SmartMoney - Seja um de Nossos Clientes</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="./resources/css/index.css">
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
            <h2><p id="chamada">Bem-vindo ao SmartMoney!</p></h2>
            <p class="pitch__1">Queremos te ajudar nas suas finan�as!</p>
            <p class="pitch__2">Caso j� tenha uma conta, clique em <strong>Entrar</strong>, sen�o, clique em <strong>Criar Conta</strong></p>
           </section>
           <section class="buttons">
            <a href="login.jsp" rel="_next" target="_self"><input type="button" class="login__btn" value="Entrar"></a>
            <a href="cadastro.jsp" rel="_next" target="_self"><input class="cadastrar__btn" type="button" value="Criar Conta"></a>
           </section>
       </section>
    </main>
    <footer class="rodape">
        <p>&copy; SmartMoney | Todos os Direitos Reservados - 2022</p>
    </footer>
</body>
</html>