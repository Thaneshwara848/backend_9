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
%>
<h1> Demo1000 </h1>

</body>
</html>