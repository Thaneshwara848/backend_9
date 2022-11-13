<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<h1 style="color: red"> Hi Welcome to JSP Page </h1>
	<%! 
		int a=100;
		int b=200;	
	%>
	<%
		int c = a+b;
	%>
	The sum of A + B is : <%=c %>
	
	
</body>
</html>