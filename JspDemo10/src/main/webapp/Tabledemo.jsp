<%@page import="java.sql.*"%>
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
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabackend","root","root");
	Statement stmt = con.createStatement();
	stmt.execute("create table ttt(id int,name varchar(10))");
	
	out.print("Successfully...!");
}
catch(Exception e)
{
	out.print(e);	
}

%>
</body>
</html>