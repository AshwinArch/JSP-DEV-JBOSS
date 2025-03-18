package com.ash;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	/*int all[]={10, 20, 30};
		request.setAttribute("result", all);
		request.getRequestDispatcher("ab.jsp").forward(request, response);*/
    	
    /*	ArrayList list=new ArrayList();
    	list.add(90);
    	list.add("abc");
    	list.add(100.90);
    	list.add(150.090);
    	request.setAttribute("result", list);
    	request.getRequestDispatcher("ab.jsp").forward(request, response);*/
    	
    	/*ArrayList list=new ArrayList();
    	HashMap map=new HashMap();
    	map.put("name", "Ramesh");
    	map.put("age", 29);
    	map.put("weight", 60.40);
    	list.add(map);
    	
    	HashMap map1=new HashMap();
    	map1.put("name", "Ashwin");
    	map1.put("age", 23);
    	map1.put("weight", 62.40);
    	list.add(map1);
    	
    	request.setAttribute("result", list);
    	request.getRequestDispatcher("abc.jsp").forward(request, response);*/
    	
    	ArrayList list=new ArrayList();
    	Person p=new Person();
    	p.setAge(22);
    	p.setName("Ashwin");
    	p.setWeight(62.90);
    	
    	Person p1=new Person();
    	p1.setAge(29);
    	p1.setName("Ramesh");
    	p1.setWeight(60.30);
    	
    	list.add(p);
    	list.add(p1);
    	
    	request.setAttribute("result", list);
    	request.getRequestDispatcher("abc.jsp").forward(request, response);
	}
}
