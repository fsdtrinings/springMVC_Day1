<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Account Info Page <br/>
	Account Holder Name :- ${param.name } <br/>
	Balance <%=request.getParameter("balance")%>
	<hr/>
	${100+1 }<br/>
	
	
</body>
</html>