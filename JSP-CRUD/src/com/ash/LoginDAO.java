package com.ash;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
public class LoginDAO 
{
	public static boolean authenticateUser(Connection con, Map<String, String[]> params)
	{
		boolean status=false;
		String uid=((String[])params.get("username"))[0];
		String pw=params.get("password")[0];
		String sql="select * from users where username = '"+uid+"' and password = '"+pw+"'";
		Statement stmt=null;
		ResultSet rs=null;
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			status=rs.next();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();			
		}
		finally
		{
			com.ash.db.Util.closeDBResources(rs, stmt);
		}
		return status;
	}
}
