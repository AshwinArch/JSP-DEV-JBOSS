package com.ash;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		out.println("Hello To All");
		out.println("Hello To All");
	}
}