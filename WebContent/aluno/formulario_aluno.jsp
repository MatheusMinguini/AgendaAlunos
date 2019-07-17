<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aluno</title>
</head>
<body>
	<form action="/AgendaAlunos/AlunoServlet" method="post">
		<fieldset>
		   <legend> Dados gerais</legend>
		   
		   <label>Nome</label>
		   <input type="text" name="nome"/>
		   
		   <label>Sobrenome</label>
		   <input type="text" name="sobrenome"/>
		   
		   <label>RG</label>
		   <input type="text" name="rg"/>
		   
		   <label>CPF</label>
		   <input type="text" name="cpf"/>
		   
		    <label>Data de nascimento</label>
		   <input type="date" name="nascimento"/>
		</fieldset><br>
		
		<fieldset>
		   <legend>Endereço</legend>
		   
		   <p> Digite o CEP que iremos buscar para você o endereço </p>
		   <label>CEP</label>
		   <input type="text" name="cep"/><br><br>
		   
		   <label>Logradouro:</label>
		   <input type="text" name="logradouro"/>
		   
		   <label>Bairro</label>
		   <input type="text" name="bairro"/>
		   
		   <label>Número</label>
		   <input type="text" name="numero"/><br><br>
		   
		   <label>Cidade</label>
		   <input type="text" name="cidade"/>
		   
		   <label>Estado</label>
		   <input type="text" name="estado"/>
		</fieldset>
		
		<br><button type="submit"> Salvar </button>
	</form>
</body>
</html>