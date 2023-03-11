<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>

	<h2> Enter Details </h2>
	
	<hr> <br>

	<form:form action="fillDetails" method="post" modelAttribute="appointmentDetails">
	
	<label for="appointmentNo">AppointnmentNo(*)</label>id
	<form:input type="int" path="appointmentNo" /> 
	<form:errors path="appointmentNo" cssClass="error"/><br><br>
	
	<label for="cost">Cost(*)</label>
	<form:input type="int" path="cost" /> 
	<form:errors path="cost" cssClass="error"/><br><br>
	
	<label for="atime">Time(*)</label>
	<form:input type="text" path="atime" /> 
	<form:errors path="atime" cssClass="error"/><br><br>
	
	<label for="adate">Date(*)</label>
	<form:input type="text" id="date" path="adate" /> 
	<form:errors path="adate" cssClass="error"/><br><br>
	
	<input type="submit" value="submit" />
	</form:form><br><br>
	
	
	<script src="resources/script.js" charset="utf-8"></script>
	
</body>
</html>