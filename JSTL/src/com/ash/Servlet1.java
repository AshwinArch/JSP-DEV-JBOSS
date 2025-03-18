	package com.ash;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String all[]={"abc", "Hello", "123"};
		request.setAttribute("list", all);
		request.getRequestDispatcher("e.jsp").forward(request, response);
	}
}
