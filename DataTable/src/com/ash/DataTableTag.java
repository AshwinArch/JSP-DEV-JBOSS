package com.ash;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class DataTableTag extends TagSupport
{
	private PageContext pageContext;
	private String className;
	private String url;
	private String user;
	private String password;
	private int colCount=0;
	private String table;
	private ResultSet rs=null;
	Connection con=null;
	Statement stmt=null;
	public void setPageContext(PageContext pageContext)
	{
			this.pageContext=pageContext;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className)
	{
		this.className = className;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user)
	{
		this.user = user;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	/**
	 * @param table the table to set
	 */
	public void setTable(String table)
	{
		this.table = table;
	}
	public int doStartTag() throws JspException
	{
		try
		{
			Class.forName(className);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		int returnStatus=SKIP_BODY;
		try
		{
			con=DriverManager.getConnection(url, user, password);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from " + table);
			if(rs.next())
			{
				JspWriter out=pageContext.getOut();
				ResultSetMetaData rsmd=rs.getMetaData();
				colCount=rsmd.getColumnCount();
				out.println("<table border='1'>");
				out.println("<tr>");
				for(int i=1;i<=colCount;i++)
				{
					out.println("<th>"+rsmd.getColumnName(i)+"</th>");
				}
				out.println("</tr>");
				returnStatus=EVAL_BODY_INCLUDE;
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		return returnStatus;
	}
	public int doAfterBody() throws JspException
	{
		JspWriter out=pageContext.getOut();
		int returnStatus=SKIP_BODY;
		try
		{
			for(int i=1;i<=colCount;i++)
			{
				out.println("<td>"+rs.getString(i)+"</td>");
			}
			out.println("</tr>");
			if(rs.next())
			{
				returnStatus=EVAL_BODY_AGAIN;
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return returnStatus;
	}
	public int doEndTag() throws JspException
	{
		if(colCount>0)
		{
			JspWriter out=pageContext.getOut();
			try
			{
				out.println("</table>");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(rs!=null)
				{
					rs.close();
					rs=null;
				}
			}
			catch (SQLException e)
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
			catch (SQLException e)
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
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return EVAL_PAGE;
	}
}
