<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
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
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next())
		{
			out.print(rs.getInt(1)+": "+rs.getString(2)+" : "+rs.getString(5));
			out.print("<br>");
			System.out.print(rs.getInt(1)+": "+rs.getString(2)+" : "+rs.getString(5));
			
		}
	
	}
	catch(Exception e)
	{
		
	}
%>

</body>
</html>