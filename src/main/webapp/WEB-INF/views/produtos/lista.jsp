<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lsimaocosta
  Date: 18/05/18
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Livros de Java, Android, Iphone, Ruby, php e muito mais - Casa do Código</title>
</head>
<body>
<table>
    <h1> Lista de Produtos</h1>
    <thead>
    <tr>
        <td>Título</td>
        <td>Descrição</td>
        <td>Páginas</td>
    </tr>

    </thead>
    <tbody>
    <c:forEach items="${produtoList}" var="produto">
        <tr>
            <td>${produto.titulo}</td>
            <td>${produto.descricao}</td>
            <td>${produto.paginas}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
