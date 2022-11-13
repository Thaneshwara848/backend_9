package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1
 */
public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Demo1() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			ServletContext context=getServletContext();
			String driver=context.getInitParameter("drivername");
			String url=context.getInitParameter("url");
			String username=context.getInitParameter("username");
			String password=context.getInitParameter("password");
			
			
			System.out.println("Driver name with Demo1  :"+driver);
			System.out.println("URL   Name with Demo1  :"+url);
			System.out.println(" USERNAME  with Demo1  :"+username);
			System.out.println("PASSWORD  Name with Demo1  :"+password);

			Class.forName("driver");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
