
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
Connection con;
PreparedStatement pstmt;
%>
<%
	int uid= Integer.parseInt(request.getParameter("uid"));
	String uname=request.getParameter("uname");
	int uage= Integer.parseInt(request.getParameter("uage"));
	int usalary= Integer.parseInt(request.getParameter("usalary"));
	String udesig=request.getParameter("udesig");
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabackend","root","root");
		pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		pstmt.setInt(1, uid);
		pstmt.setString(2, uname);
		pstmt.setInt(3, uage);
		pstmt.setInt(4, usalary);
		pstmt.setString(5,udesig);
		
		pstmt.execute();
		
		out.print("data inserted successfully...!");
	}
	catch(Exception e)
	{
		
	}
%>
</body>
</html>