<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome to telusko

${welcomemsg}

To get Animals
<form action="getAnimals">
<input type="submit"></form>
<hr>

To set Animal
<form action="addAnimal" method="post">
Enter id: <input type="text" name="aid"><br>
Enter Name: <input type="text" name="aname"><br>
Enter age: <input type="text" name="aage"><br>
<input type="submit"></form>
<hr>

To get Animal
<form action="getAnimal">
Enter id: <input type="text" name="aid"><br>
<input type="submit"></form>
<hr>

</body>
</html>