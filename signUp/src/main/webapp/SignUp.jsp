<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
</head>
<body>
<form action="SignUp" method="post">
        <h1>Sign Up</h1>
        <span class="text-success">${success}</span>
        <span class="text-danger">${failure}</span>
        <br><br>
        UserName: <input type="text" name="userName" value="${dto.userName }"><br>
        Email: <input type="text" name="email" value = "${dto.email }"><br>
        PassWord: <input type="password" name="password" value = "${dto.password }"><br>
        Confirm PassWord: <input type="password" name="confirmPassword" value = "${dto.confirmPassword }"><br>
        <br>
        <input type="submit" value="Sign Up">
    </form>

</body>
</html>