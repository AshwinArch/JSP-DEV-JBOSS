package com.ash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
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
		boolean status=false;
		Connection con=null;
		try 
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		ActionForward forw=null;
		StringBuffer sql=new StringBuffer();
		sql.append("select * from nur_user ");
		sql.append("where user_name = '"+login.getUsername()+"'");
		sql.append(" and ");
		sql.append("password = '"+login.getPassword()+"'");
		Statement stmt=null;
		ResultSet rs=null;
		String twist=null;
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql.toString());
			status=rs.next();
			
			if(status==true)
			{
				twist=rs.getString(10);
				if(twist.equals("mechanical"))
				{
					 forw=mapping.findForward("mech");
				}
				else if(twist.equals("electronics"))
				{
					forw=mapping.findForward("elec");
				}
				else if(twist.equals("software"))
				{
					forw=mapping.findForward("soft");
				}
			}
			else
			{
				forw=mapping.findForward("failure");
			}
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
		return forw;
	}
}