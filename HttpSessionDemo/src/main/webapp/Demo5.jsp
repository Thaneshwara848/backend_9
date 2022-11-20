<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name =(String )session.getAttribute("mlun");
out.print("<p style='text-align:right'>");
out.print("Name : "+name );
out.print("</p>");


out.print("<a href='Demo1000.jsp'>NEXT PAGE  </a>");
%>
<h1> Demo5 </h1>
</body>
</html>