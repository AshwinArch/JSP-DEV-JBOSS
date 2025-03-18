package com.ash;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO
{
	public static boolean authenticateUser(RegForm login, Connection con)throws SQLException
	{
		boolean status=false;
		StringBuffer sql=new StringBuffer();
		sql.append("insert into tableuser values ('"+login.getUsername()+"' , '"+login.getPassword()+"' , '"+login.getGender()+"' , '"+login.getSkills()+"' , '"+login.getQualification()+"')");                                                                 
		Statement stmt=null;
		int i=0;
		try 
		{
			stmt=con.createStatement();
			i=stmt.executeUpdate(sql.toString());
			if(i==1)
			{
				status=true;
			}
		} 
		finally
		{
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
