<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello World
	
	<br/>
	
	for(int x = 0;x<10;x++)Hello-World
	<br/>
	Scriptlet-tag
	<%		
		for(int i = 0;i<10;i++)
		{
			%>
			<br/> <i>Hello World</i>
			<%
		}//end of for
	%>
</body>
</html>