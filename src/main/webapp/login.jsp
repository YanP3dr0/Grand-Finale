<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | Bem-vindo</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="./resources/css/login.css">
</head>
<body>
    <header class="logo">
        <h1><a href="index.jsp" rel="_previous"><img src="./resources/img/Smart_Money-removebg-preview.png" alt="Logo da SmartMoney" width="300px"></img></a>
        </h1>
    </header>
    <main class="container">
        <section class="content">
            <div class="cpf">
                <label for="txt_Cpf"></label>
                <input id="txt_Cpf" name="txt_Cpf" type="text" autocomplete="on" required maxlength="14" placeholder="*CPF">
            </div>
            <div class="senha">
                <label for="txt_Senha"></label>
                <input type="password" required maxlength="8" placeholder="*Senha">
            </div>
                <a href="#" class="button-continue">
                    <button>Entrar
                    </button>  
                </a>
                <h2 class="esqueci_senha">
                    <a href="#">
                        <div>Esqueci minha senha</div>
                    </a>
                </h2>
            <div class="biometria">
                <a href=""><img src="img/biometria.png" alt=""></a>
            </div>
            <div class="descritivo">
                Entre utlizando sua<br>impressão digital</br>
            </div>
        </section>
    </main>
</body>
</html>