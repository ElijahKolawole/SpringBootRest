<%--
  Created by IntelliJ IDEA.
  User: Elijah
  Date: 12/24/2019
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alien</title>
</head>
<body>
<h1>Index Servlet for Alien</h1>
<form action="addAlien">
    ID: <input type="text" name="aId"><br>
    Name: <input type="text" name="aName"><br>
    Language: <input type="text" name="lang"><br>
    <input type="submit" name="submit">
</form>

<hr>
        <h2>Enter ID and click submit to search for alien</h2>
<form action="getAlien">
    ID: <input type="text" name="aId"><br>
    <input type="submit" name="submit">
</form>

</body>
</html>
