<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String name; %>
<%
	 name= request.getParameter("uname");

	session.setAttribute("mlun", name);
	
	out.print("<p style='text-align:right'>");
	out.print("Name : "+name );
	out.print("</p>");
	
	out.print("<a href='Demo5.jsp'>NEXT PAGE  </a>");
	
%>
<h1> Demo1 </h1>
</body>
</html>