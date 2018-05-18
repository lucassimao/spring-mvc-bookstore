<%--
  Created by IntelliJ IDEA.
  User: lsimaocosta
  Date: 18/05/18
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Livros de Java, Android, Iphone, Ruby, php e muito mais - Casa do Código</title>
</head>
<body>
<form action="/produtos" method="post">
    <div>
        <label>Título</label>
        <input name="titulo" type="text">
    </div>
    <div>
        <label>Descrição</label>
        <textarea name="descricao" rows="10" cols="20"></textarea>
    </div>
    <div>
        <label>Páginas</label>
        <input name="paginas" type="text">
    </div>
    <button type="submit">Cadastrar</button>
</form>

</body>
</html>
