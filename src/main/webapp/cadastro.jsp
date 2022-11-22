<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Abrir Conta - Seu Dinheiro, nosso Compromisso</title>
    <%@ include file="header.jsp" %>
	<link rel="stylesheet" href="./resources/css/cadastro.css">
</head>
<body>

    <header>
        <h1 class="logo"><a href="../index.html" rel="_previous" target="_parent"><img src="img/Smart_Money-removebg-preview.png" width="200px" alt="Logo da SmartMoney"></a></h1>
    </div>
    <nav>
        <ul class="nav__links">
            <li>
                <a href="../assets/home.html">Home</a>
            </li>
            <li>
                <a href="login.html">Login</a>
            </li>
            <li class="logout">
                <a href=""><img src="img/Logout.svg" alt=""></img>  <span class="logout__Text">Logout</span></a>
            </li>
        </ul>
    </nav>
</header>

    <main>
        <c:if test="${not empty msg }">
            <div class="alert alert-success">${msg}</div>
        </c:if>
        <c:if test="${not empty erro }">
            <div class="alert alert-danger">${erro}</div>
        </c:if>

        <section class="main__container">
            <div class="form-image">
                <img src="./resources/img/undraw_credit_card_re_blml.svg" alt="Cart�o Banc�rio">
            </div>

            <div class="form">
                <form action="cadastro?acao=cadastrar" method="post">
                    <div class="form__header">
                        <div class="title">
                            <h2>Abrir Conta</h2>
                        </div>
                    </div>

                    <div class="input-group">

                        <div class="input-box">
                            <label for="txtNome"></label>
                            <input id="txtNome" name="nome" type="text" placeholder="*Nome" maxlength="100" size="25" autocomplete="off">
                        </div>

                        <div class="input-box">
                            <label for="txtCpf"></label>
                            <input id="txtCpf" name="cpf" type="text" placeholder="*CPF" maxlength="14" autocomplete="off">
                        </div>

                        <div class="input-box">
                            <label for="txtEmail"></label>
                            <input id="txtEmail" name="email" type="email" placeholder="*E-mail" autocomplete="on" maxlength="40" size="25">
                        </div>

                        <div class="input-box">
                            <label for="txtDataNascimento"></label>
                            <input id="txtDataNascimento" name="dataNascimento" type="text" size="20" maxlength="10" placeholder="*Data de nascimento" autocomplete="on">
                        </div>

                        <div class="input-box">
                            <label for="txtSenha"></label>
                            <input type="password" id="senha" name="senha" placeholder="*Crie sua Senha" size="25" maxlength="12" autocomplete="off">
                        </div>
                        
                        <div class="input-box">
                            <label for="txtConfirmarSenha"></label>
                            <input type="password" id="confirmarSenha" name="confirmarSenha" placeholder="*Confirme sua Senha" size="20" maxlength="12" autocomplete="off">
                        </div>

                        <div class="gender-group">
                            <div class="gender-input">
                                <input type="radio" name="gender" id="female" value="Feminino">
                                <label for="Female">Feminino</label>
                            </div>

                            <div class="gender-input">
                                <input type="radio" name="gender" id="male" value="Masculino">
                                <label for="male">Masculino</label>
                            </div>

                            <div class="gender-input">
                                <input type="radio" name="gender" id="outros" value="Outros">
                                <label for="outros">Outros</label>
                            </div>

                            <div class="gender-input">
                                <input type="radio" name="gender" id="notPrefer" value="Prefiro n�o dizer">
                                <label for="notPrefer">Prefiro n�o dizer</label>
                            </div>

                        </div>

                        <a href="#" class="button-continue">
                            <button>Cadastrar</button>
                        </a>
                    </div>
                </form>
            </div>
        </section>
    </main>
  <%@ include file="footer.jsp" %>
</body>
</html>