
package com.ash;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO
{
	public static boolean authenticateUser(LoginForm login, Connection con)throws SQLException
	{
		boolean status=false;
		StringBuffer sql=new StringBuffer();
		sql.append("select * from users ");
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
		} 
		finally
		{
			if(rs!=null)
			{
				try 
				{
					rs.close();
					rs=null;
				}
				finally
				{}
			}
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
					stmt=null;
				}
				finally
				{}
			}
			if(con!=null)
			{
				try 
				{
					con.close();
					con=null;
				}
				finally
				{}
			}
			return status;
		}
	}
}
