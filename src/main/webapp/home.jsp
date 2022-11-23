<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home | SmartMoney</title>
    <%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/css/home.css">

</head>
<body>
    <header class="o-header">

            <h1 class="logo"><a href="#" rel="_previous" target="_parent"><img src="./resources/img/Smart_Money-removebg-preview.png" width="200px" alt="Logo da SmartMoney"></a></h1>
        <nav>
            <ul class="nav__links">
                <li>
                    <a href="home.jsp">Home</a>
                </li>
                <li>
                    <a href="conta?&acao=consulta" rel="_next" target="_self">Contas</a>
                </li>
                <li>
                    <a href="receita?&acao=consulta" rel="_next" target="_self">Receitas</a>
                </li>
                <li>
                    <a href="despesa?&acao=consulta" rel="_next" target="_self">Despesas</a>
                </li>
                <li>
                    <a href="investimento?&acao=consulta" rel="_next" target="_self">Investimentos</a>
                </li>
                <li class="logout">
                    <a href="login"><img src="./resources/img/Logout.svg" alt=""></img>  <span class="logout__Text">Logout</span></a>
                </li>
            </ul>
        </nav>
    </header>
    <aside class="o-aside">
        <c:if test="${not empty msg }">
            <div class="alert alert-success">${msg}</div>
        </c:if>
        <c:if test="${not empty erro }">
            <div class="alert alert-danger">${erro}</div>
        </c:if>

        <div class="container__aside">
            <div class="content__aside">
                <div class="content__aside___titulo">
                  Transações
                </div>

                <div class="content__aside__categorias">
                    <form action="despesa?acao=cadastrar" method="post">
                        <input type="hidden" value="${userId}" name="userId">
                      <ul>
	                            <div class="content__aside___despesas">
	                                <li>
	                                    <!-- <img src="img/alimentacao.svg" alt="">
	                                   <label for="txt_food__d">Alimentaï¿½ï¿½o
	                                </label> -->
	                                <label for=""></label>
	                                <label for=""></label>
	                                <div><input name="descricao" type="text" class="valor_transacoes" id="" placeholder="Descrição" ></div>
	                                </li>
	                            </div>
	                            <div class="content__aside___despesas">
	                                <li>
	                                    <div><input name="valor" type="text" class="valor_transacoes" onkeypress="$(this).mask('R$ #.##0.##0,00', {reverse: true});" placeholder="Valor: R$"></div>
	                                </li>
	                            </div>
	                            <div class="content__aside___btn">
	                                <a href="#"><button class="btn__despesas">Criar Despesa</button></a>
	                            </div>
	                    </form>
	
	                    <form action="receita?acao=cadastrar" method="post">
	                        <input type="hidden" value="${userId}" name="userId">
	                        <div class="content__aside___despesas">
	                            <li>
	                                <div><input name="descricao" type="text" class="valor_transacoes"  placeholder="Descrição" ></div>
	                            </li>
	                        </div>
	                        <div class="content__aside___receitas">
	                            <li>
	                                <div><input name="valor" type="text" class="valor_transacoes" onkeypress="$(this).mask('R$ #.##0.##0,00', {reverse: true});"placeholder="Valor: R$"></div>
	                            </li>
	                        </div>
	                        <div class="content__aside___btn">
	                            <a href="#"><button class="btn__receitas">Criar Receita</button></a>
	                        </div>
	                    </form>

                      </ul>
                </div>
                
    </aside>
    <main class="o-main">
        <section class="show_Saldo">
            <div class="saldo_User">
                <div class="boas__vindas">
                    <img src="img/user.svg" alt="">
                    Olá, ${user} <br>Bem-vindo novamente!</br>
                </div>
                <div class="saldo">
                    Saldo Geral
                    <input type="text" class="saldo_conta" onkeypress="$(this).mask('R$ #.##0.##0,00', {reverse: true});">
                </div>
            </div>
        </section>

        <section>
            <div class="teste">
                <div class="container_forms">
                    <div class="o-ContaBancaria">
                        <div class="cad__ContaBancaria___Titulo">
                            Conta
                        </div>
                        
                        <div class="form_Conta">
                            <form action="conta?acao=cadastrar" method="post">
                                <input type="hidden" value="${userId}" name="userId">
                                <div class="container_Conta">

                                    <div class="conta__inputs">
                                        <label for="numero_Agencia">
                                            <input name ="agencia" type="text" placeholder="Agência" id="numero_Agencia" autofocus>
                                        </label>
                                    </div>

                                    <div class="conta__inputs">
                                        <label for="">
                                            <input name="nm_conta" type="text" placeholder="Nm da Conta">
                                        </label>
                                    </div>

                                    <div class="conta__inputs">
                                        <label for="">
                                            <input name="dg_conta" type="text" placeholder="Digito da conta">
                                        </label>
                                    </div>


                                    <div class="conta__inputs">
                                        <label for="">
                                            <input name="saldo" type="text" placeholder="Saldo">
                                        </label>
                                    </div>

                                    <div class="conta__main___btn">
                                        <a href="#"><button class="btn__despesas">Criar Conta</button></a>
                                    </div>

                                </div>
                            </form>
                        </div>

                        <div class="o-Investimentos">
                            <div class="cad__Investimentos___Titulo">
                               Investimento
                            </div>

                            <div class="form_Investimentos">
                                <form action="investimento?acao=cadastrar" method="post">
                                    <input type="hidden" value="${userId}" name="userId">
                                   <div class="container_Investimentos">
                                       <div class="investimentos__inputs">
                                           <label for="">
                                           	  <input name="data_transacao" type="text" placeholder="Data da Transação" onkeypress="$(this).mask('00/00/0000')">
                                           </label>
                                       </div>

                                       <div class="investimentos__inputs">
                                           <label for="">
                                               <input name="vl_aplicacao" type="text" placeholder="Valor da Aplicação">
                                           </label>
                                       </div>

                                       <div class="investimentos__inputs">
                                           <label for="">
                                               <input name="vl_resgate" type="text" placeholder="Valor Resgate">
                                           </label>
                                       </div>

                                       <div class="investimentos__inputs">
                                           <label for="">
                                               <input name="vl_rendimento" type="text" placeholder="Valor Rendimento">
                                           </label>
                                       </div>

                                       <div class="investimentos__inputs">
                                           <label for="">
                                               <input name="vl_ir" type="text" placeholder="Valor IR">
                                           </label>
                                       </div>

                                       <div class="investimentos__inputs">
                                           <label for="">
                                               <input name="vl_iof" type="text" placeholder="Valor IOF">
                                           </label>
                                       </div>

                                       <div class="conta__main___btn">
                                            <a href="#"><button class="btn__despesas">Criar Investimento</button></a>
                                        </div>

                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>
    <footer class="o-footer"></footer>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.min.js"></script>
