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
    
      <c:if test="${not empty msg }">
        <div class="alert alert-success">
          ${msg}
        </div>
      </c:if>
      <c:if test="${not empty erro }">
         <div class="alert alert-danger">${erro}</div>
     </c:if>
    <main class="container">
        <section class="content">
              <form action="login" method="post">
                  <div class="email">
                      <label for="email"></label>
                      <input id="email" name="email" type="text" autocomplete="on" placeholder="*email">
                  </div>
                  <div class="senha">
                      <label for="senha"></label>
                      <input id="senha" name="senha" type="password" required maxlength="8" placeholder="*Senha">
                  </div>
                  <div class="mostrar_Senha">
                    <label class="switch">
                        <span class="switch-text">Mostrar Senha</span>
                        <div class="switch-wrapper">
                            <input type="checkbox" id="watch" onclick="mostrarClick()"/>
                            <span class="switch-button"></span>
                        </div>
                    </label>
            
                </div>
                  <a href="#" class="button-continue">
                      <button>Entrar
                      </button>  
                  </a>
              </form>
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
<script src="./resources/js/login.js"></script>
</html>