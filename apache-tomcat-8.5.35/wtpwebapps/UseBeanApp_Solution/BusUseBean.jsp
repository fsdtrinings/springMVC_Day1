<%@page import="beans.BusDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="busInfo" class="beans.Bus" scope="request">
		<jsp:setProperty property="*" name="busInfo"/>	
	</jsp:useBean>
	
	<%
		BusDAO obj = new BusDAO();
		obj.insertBus(busInfo);
		busInfo.setTime(500);
	%>
	<%=busInfo.doBusThings()%>
	
	<jsp:forward page="DisplayBusPage.jsp"/>
	
</body>
</html>