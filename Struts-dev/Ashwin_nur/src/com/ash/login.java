package com.ash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

 public class login extends Action 
 {
	 static
	 {
		 try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
	 }
   public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
	   
	    loginform login=(loginform)form;
		
		boolean status=authenticateUser(login);
		ActionForward forward=null;
		if(status)
		{
			forward=mapping.findForward("success");
		}
		else
		{
			forward=mapping.findForward("failure");
			ActionErrors errors=new ActionErrors();
			ActionError error=new ActionError("login.failed");
			errors.add("login.failed", error);
			saveErrors(request, errors);
			login.setPassword("");
		}
		return forward;
	   
		/*	loginform log=(loginform)form;
			String un=log.getUsername();
			String pw=log.getPassword();
			System.out.println(un);
			System.out.println(pw);
		
		 if(un.equals("admin")&& pw.equals("admin"))
		 {
			 return mapping.findForward("success");
		 }
		 else
		 {
			 return mapping.findForward("failure");
		 }
		 */	
	 }   	  
   static String twist;
   public static boolean authenticateUser(ActionForm log)throws SQLException
	{
	   loginform login=(loginform)log;
		boolean status=false;
		Connection con=null;
		try 
		{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		StringBuffer sql=new StringBuffer();
		sql.append("select * from nur_user ");
		sql.append("where username = '"+login.getUsername()+"'");
		sql.append(" and ");
		sql.append("password = '"+login.getPassword()+"'");
		Statement stmt=null;
		ResultSet rs=null;
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql.toString());
			status=rs.next();
			twist=rs.getNString("SPECIALIZATION");
			System.out.println(twist);
		} 
		finally
		{
				try 
				{
					if(rs!=null)
					{
					rs.close();
					rs=null;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				try 
				{
					if(stmt!=null)
					{

					stmt.close();
					stmt=null;
					}	
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				try 
				{
					if(con!=null)
					{
					con.close();
					con=null;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			return status;
		}
	}
  
