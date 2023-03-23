<%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 22.03.2023
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>WebCalculator</title>
</head>
<h2>WebCalculator</h2>

<small>разрешено вводить только цифры и операторы + - * /</small>
<form action="showResult" method="get">
    <input type="text" name="expression" placeholder="Введите математическое выражение" size="30"
           pattern="([-+]?[0-9]*\.?[0-9]+[\/\+\-\*])+([-+]?[0-9]*\.?[0-9]+)">
    <input type="submit" value="Вычислить">
</form>

<body>

</body>
</html>
