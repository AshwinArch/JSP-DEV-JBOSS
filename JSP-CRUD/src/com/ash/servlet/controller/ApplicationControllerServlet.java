package com.ash.servlet.controller;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ash.LoginDAO;
import com.ash.db.pool.connectionPool;
public class ApplicationControllerServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	connectionPool cp=null;
	public void init() throws ServletException 
	{
		String classname=getInitParameter("classname");
		String url=getInitParameter("url");
		String user=getInitParameter("user");
		String password=getInitParameter("password");
		String poolsize=getInitParameter("poolsize");
		cp=new connectionPool(classname, url, user, password, Integer.parseInt(poolsize));
		cp.init();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPerform(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPerform(request, response);
	}
	public void destroy()
	{
		cp.release();
	}
	protected void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection con=cp.checkOut();
		request.setAttribute("con", con);
		RequestDispatcher rd=null;
		String path=request.getServletPath();
		path=path.substring(1, path.length()-3);
		if("getLogin".equals(path))
		{
			rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else if("login".equals(path))
		{
			boolean status=LoginDAO.authenticateUser(con, request.getParameterMap());
			if(status)
			{
				request.setAttribute("LoginStatus", "Login is success");
				rd=request.getRequestDispatcher("services.jsp");
			}
			else
			{
				request.setAttribute("LoginStatus", "Login is failed");
				rd=request.getRequestDispatcher("login.jsp");
			}
			rd.forward(request, response);
		}
		/*if("registration".equals(path))
		{
			rd=request.getRequestDispatcher("RegistrationServlet");
			rd.forward(request, response);
		}
		else if("login".equals(path))
		{
			rd=request.getRequestDispatcher("LoginServlet");
			rd.forward(request, response);
		}
		else if("add".equals(path))
		{
			rd=request.getRequestDispatcher("addEmployeeServlet");
			rd.forward(request, response);
		}
		else if("search".equals(path))
		{
			rd=request.getRequestDispatcher("SearchEmployeeServlet");
			rd.forward(request, response);
		}
		else if("readEmp".equals(path))
		{
			rd=request.getRequestDispatcher("ReadEmployeeServlet");
			rd.forward(request, response);
		}
		else if("readEmp4Delete".equals(path))
		{
			rd=request.getRequestDispatcher("DeleteEmployeeServlet");
			rd.forward(request, response);
		}
		else if("readEmp4Edit".equals(path))
		{
			rd=request.getRequestDispatcher("EditEmployeeServlet");
			rd.forward(request, response);
		}
		else if("saveEmp".equals(path))
		{
			rd=request.getRequestDispatcher("SaveEmployeeServlet");
			rd.forward(request, response);
		}*/
		cp.checkIn(con);
	
	}
}
