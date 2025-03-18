package com.ash.db;

import java.sql.ResultSet;
import java.sql.Statement;
public class Util 
{
	public static void closeDBResources(ResultSet rs, Statement stmt)
	{
		try 
		{
			if(rs!=null)
			{
				rs.close();
				rs=null;
			}
		} 
		catch (Exception e) 
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
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
