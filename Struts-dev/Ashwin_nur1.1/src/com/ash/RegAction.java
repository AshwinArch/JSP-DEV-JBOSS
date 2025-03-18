/* 
* <Copyright information>
*
* <Customer specific copyright notice (if any) >
*
* <File Name>
*
* <Short Description>
*
* <Version Number > 
*
* <Created Date in dd mmm yyyy format>
*
* <Modification History>
*/
package com.ash;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegAction extends Action
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
			// TODO: handle exception
		}
	}
	 /**
	  *for getting connection for jdbc.........
	  * @return Connection
	  * @exception SQLException
	  * @see 		public static Connection getConnection()throws SQLException
	  */

		public static Connection getConnection()throws SQLException
		{
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
		}
		
		 /**
		  *for redirecting the flow of our method execution
		  * @param ResultSet
		  * @param Statement
		  * @param Connection
		  * @return void
		  * @exception SecurityException If the security manager cannot be
		  * created
		  * @see public static void closeAllResources(ResultSet rs,Statement stmt, Connection con )
		  */
		public static void closeAllResources(ResultSet rs,Statement stmt, Connection con )
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
				// TODO: handle exception
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
				// TODO: handle exception
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
				// TODO: handle exception
			}
		}
		
		 /**
		  *for redirecting the flow of our method execution
		  * @param ActionMapping
		  * @param ActionForm
		  * @param HttpServletRequest
		  * @param HttpServletResponse
		  * @return ActionForward
		  * @exception Exception
		  * @exception SecurityException If the security manager cannot be
		  * created
		  * @see public ActionForward execute(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception 
		  * @see isHip
		  */

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		boolean status=insertUser(form);
		if(status==false)
		{
			return mapping.findForward("success");
		}
		else
		{
			return mapping.findForward("failure");
		}
	}

	
	 /**
	  *for handling jdbc connection ...
	  * @param ActionForm
		  * @exception Exception
	  * @exception SecurityException If the security manager cannot be
	  * created
	  * @seepublic static boolean insertUser(ActionForm regf)
	  * @see isHip
	  */

	public static boolean insertUser(ActionForm regf)
	{
		RegForm reg=(RegForm)regf;
		Connection con=null;
		CallableStatement cstmt=null;
		boolean status=true;
		try 
		{
			con=getConnection();
			cstmt=con.prepareCall("{call p1( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
		
			cstmt.setString(1, reg.getT1());
			cstmt.setString(2, reg.getFirstname());
			cstmt.setString(3, reg.getLastname());
			cstmt.setString(4, reg.getUsername());
			cstmt.setString(5, reg.getEmail());
			cstmt.setString(6, reg.getPassword());
			cstmt.setLong(7, reg.getContact());
			cstmt.setString(8, reg.getSubs());
			cstmt.setString(9, reg.getInterest());
			cstmt.setString(10, reg.getAddress());
			cstmt.setString(11, reg.getCity());
			cstmt.setString(12, reg.getState());
			cstmt.setInt(13, reg.getPincode());
			cstmt.setInt(14, reg.getCoun_id());
			
			status=cstmt.execute();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			try
			{
				closeAllResources(null, cstmt, con);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return status;
	}
}