<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="p1.Dog"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	New Account Input page
	
	
	<spring:form action="abc" method="post" modelAttribute="accountInBag">
		Enter Account Number  <spring:input path="id"/> <br/>
		Enter Account Name  <spring:input path="name"/> <br/>
		Enter Account Balance  <spring:input path="balance"/> <br/>
		
		<input type="submit">
	</spring:form>
	
</body>
</html>