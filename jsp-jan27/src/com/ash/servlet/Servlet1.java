package com.ash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ash.LoginBean;
public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		LoginBean login=(LoginBean)request.getSession().getAttribute("login");
		String un=login.getUsername();
		String pw=login.getPassword();
		PrintWriter out=response.getWriter();
		out.println("username : "+un+"<br>");
		out.println("password : "+pw);
	}
}
