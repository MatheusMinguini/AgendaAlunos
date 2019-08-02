

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.List" %>
<%@ page import="model.Aluno" %>
<jsp:useBean id="dao" class="dao.AlunoDAO"/>
 

<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Suap</title>
</head>
<body>
  
   <h5>Sistema Integrado de Gestão de alunos</h5>
   
   <% 
   	if(request.getAttribute("retorno") == "sucesso") {
   %>
		<h5 style="color:green"> Aluno cadastrado com sucesso </h5>
   <%
	}
   %>
   
   <% 
   	if(request.getAttribute("retorno") == "erro") {
   %>
		<h5 style="color:red"> Infelizmente, houve um erro ao inserir o Aluno, nos desculpe e tente mais tarde! </h5>
   <%
	}
   %>
       
   
   <table>
	   <thead>
			<tr>
			    <th>Nome</th>
			    <th>Sobrenome</th>
			    <th>CPF</th>
			    <th>RG</th>
			</tr>
		</thead>
		<tbody>
			<tag:forEach var="aluno" items="${alunos_cadastrados}">
				<tr>
				    <td><tag:out value="${aluno.getNome()}" /></td>
				    <td><tag:out value="${aluno.getSobrenome()}"/></td>
				    <td><tag:out value="${aluno.getCpf()}"/></td>
				    <td><tag:out value="${aluno.getRg()}"/></td>
				    <td><a href="Servlet?action=deletar&id" >Deletar</a></td>
				</tr>
			</tag:forEach>
		</tbody>
	</table>
</body>
</html>