package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2
 */
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
			
				ServletContext context=getServletContext();
				String driver=context.getInitParameter("drivername");
				String url=context.getInitParameter("url");
				String username=context.getInitParameter("username");
				String password=context.getInitParameter("password");
				
				
				System.out.println("Driver name with Demo2   :"+driver);
				System.out.println("URL   Name with Demo 2   :"+url);
				System.out.println(" USERNAME  with Demo 2   :"+username);
				System.out.println("PASSWORD  Name with Demo2   :"+password);
				
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//1000 : java 

