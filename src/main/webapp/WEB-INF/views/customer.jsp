<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>

	<h2> Enter Details </h2>
	
	<hr> <br>

	<form:form action="createRecord" method="post" modelAttribute="Customer">
	
	<label for="id">Id(*)</label>id
	<form:input type="int" path="id" /> 
	<form:errors path="id" cssClass="error"/><br><br>
	
	<label for="name">Name(*)</label>
	<form:input type="text" path="name" /> 
	<form:errors path="name" cssClass="error"/><br><br>
	
	<label for="patientName">Patient name(*)</label>
	<form:input type="text" path="patientName" /> 
	<form:errors path="patientName" cssClass="error"/><br><br>
	
	<label for="address">Address(*)</label>
	<form:input type="int" path="address" /> 
	<form:errors path="address" cssClass="error"/><br><br>
	
	<label for="service">Service(*)</label>
	<form:input type="text" path="service" /> 
	<form:errors path="service" cssClass="error"/><br><br>
	
	<label for="mobileNo">Mobile No(*)</label>
	<form:input type="int" path="mobileNo" /> 
	<form:errors path="mobileNo" cssClass="error"/><br><br>
	
	
    

	
	
	
	
	
	
	
	<input type="submit" value="submit" />
	</form:form><br><br>
	
	
	
	
</body>
</html>