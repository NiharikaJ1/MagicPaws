<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>

	<h2> Customer Registration Form </h2>
	
	<hr> <br>
	
	<form:form action="registerAct" method="post" modelAttribute="login">
	
	<label for="userName">User Name(*)</label>
	<form:input type="text" path="userName" /> 
	<form:errors path="userName" cssClass="error"/><br><br>
	
	<label for="pass">Password(*)</label>
	<form:input type="text" path="pass" /> 
	<form:errors path="pass" cssClass="error"/><br><br>
<br>	User type-
	<input type="radio" id="customer" name="utype" value="customer">
  <label for="customer">Customer</label>
  <input type="radio" id="admin" name="utype" value="admin">
  <label for="admin">Admin</label><br>
	
	
	
	
	
	
	
	
	<input type="submit" value="submit" />
	</form:form><br><br>
	
	
	
	
</body>
</html>