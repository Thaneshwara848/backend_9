<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Hi We are building calculator...........</h1>

<%
	int a = Integer.parseInt(request.getParameter("aval"));
	int b = Integer.parseInt(request.getParameter("bval"));
	int c= a+b;
	
	
%>
<b style="color: red">The SUm of A + B is  : <%=c %></b>
</body>
</html>

Diclatation tags 
Expression tag 
Scriptlet tag 

				implecit objects : 
							
HttpServlerRequest request;-------------------request
HttpServletResponce responce ;----------------responce 
PrintWriter out;	--------------------------out
ApplicationCOnfig config;--------------------config
ApplicationContext context;-----------------context
HttpSession session;-------------------------session






