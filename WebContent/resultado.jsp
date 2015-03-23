<%@ page import="java.util.*"%>
<%@page import="model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/imagens.css">
<link rel="stylesheet" href="./css/main.css">
<title>Guia de sapatos</title>
</head>
<body>
	<a href="index.html">Voltar</a>
	<h2>Sapatos Recomendados</h2>
	<%
		TreeSet<Sapato> lista = (TreeSet<Sapato>) request
				.getAttribute("listaDeMarcas");

		for (Sapato sapato : lista) {

			out.println("<div class=\"img\">");
			out.println("<div class=\"nome\">" + sapato.getNome()
					+ "</div>");
			out.println("<a target=\"_blank\" href=\"carrinho.html\">");
			out.println("<img src=\"./img/" + sapato.getImagem()
					+ ".jpg\" alt=\"" + sapato.getNome()
					+ "\" width=\"210\" height=\"210\"></a>");
			out.println("<div class=\"desc\">Estilo: " + sapato.getEstilo()
					+ "</div>");
			out.println("<div class=\"desc\">Cor: " + sapato.getCor()
					+ "</div>");
			out.println("<div class=\"desc\">Tamanho: " + sapato.getTamanho()
					+ "</div>");
			out.println("</div>");
		}
	%>
</body>
</html>