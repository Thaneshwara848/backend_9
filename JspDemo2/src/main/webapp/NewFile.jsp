
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: red;font-style: italic;"> Hi COllectionDemo </h1>
		 <% 
		ArrayList al= new ArrayList();
		 al.add(100);
		 al.add(200);
		 al.add(300);
		 al.add("Thanesh");
		 al.add('A');
		 al.add(true);
		 Iterator i=al.iterator();
		 while(i.hasNext())
		 {
			 out.print(i.next());
			 out.print("<br>");
		 }
		 %>
		 <%=al%>

</body>
</html>