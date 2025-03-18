package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLClient
{
	private String driverClass;
	private String url;
	private String user;
	private String password;
	
	private ArrayList<String> sqlQueries=new ArrayList<String>();
	
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getResults(String sql)
	{
		sql=sql.toLowerCase();
		if(sql.endsWith(";"))
		{
			sql=sql.substring(0, sql.length()-1);
		}
		try 
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		StringBuffer buffer=new StringBuffer();
		try 
		{
			con=DriverManager.getConnection(url, user, password);
			stmt=con.createStatement();
			if(sql.startsWith("create"))
			{
				stmt.execute(sql);
				buffer.append("table created successfully");
			}
			else if (sql.startsWith("insert")||sql.startsWith("delete")||sql.startsWith("update"))
			{
				int i=stmt.executeUpdate(sql);
				buffer.append(i+": rows Updated");
			}
			else if (sql.startsWith("select"))
			{
				rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int colCount=rsmd.getColumnCount();
				boolean flag=true;
				while(rs.next())
				{
					if(flag)
					{
						flag=false;
						buffer.append("<table border='1'>");
						buffer.append("<tr>");
						for (int i = 1; i <= colCount ; i++)
						{
							buffer.append("<th>"+rsmd.getColumnName(i)+"</th>");
						}
						buffer.append("</tr>");
					}
					buffer.append("<tr>");
					for(int i=1; i<=colCount; i++)
					{
						buffer.append("<td>"+rs.getString(i)+"</td>");
					}
					buffer.append("</tr>");
				}
				if(!flag)
				{
					buffer.append("</table>");
				}
				else
				{
					buffer.append("No records found");
				}
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
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
		// if more then 10 rs exist then only remove 0 index element of arraylist(sqlqueries).
		if(!sqlQueries.contains(sql))
		{
			sqlQueries.add(sql);
			while (sqlQueries.size()>10) 
			{
				sqlQueries.remove(0);
			}
		}
		return buffer.toString();
	}

	public String getListOfSQLQueries()
	{
		StringBuffer buffer=new StringBuffer();
		if(sqlQueries.size()>0)
		{
				buffer.append("<table border='1'>");
				for(int i=0;i<sqlQueries.size(); i++)
				{
					buffer.append("<tr><td><input type = \"radio\" name = \"sqlQuery\" value = \""+ sqlQueries.get(i) +"\" onclick = 'retrieve()'> " + sqlQueries.get(i) + "</td></tr>");
				}
//				System.out.println(buffer.toString());
				buffer.append("</table>");
				buffer.append("<script>");
				buffer.append("function retrieve()");
				buffer.append("{");
 //   			buffer.append("alert(1)");
				buffer.append("var myForm=document.forms[0];");
				buffer.append("var sqlQuery=myForm.sqlQuery;");
				buffer.append("var sql=myForm.sql;");
				buffer.append("for(var i=0; i<sqlQuery.length; i++)");
				buffer.append("{");
				buffer.append("if(sqlQuery[i].checked)");
				buffer.append("{");
				buffer.append("sql.value=sqlQuery[i].value;");
				buffer.append("}");
				buffer.append("}");
				buffer.append("}");
				buffer.append("</script>");
			}
		return buffer.toString();
    }
}
	
		