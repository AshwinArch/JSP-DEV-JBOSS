/* 
* <Copyright information>
*
* <Customer specific copyright notice (if any) >
*
* <File Name login.java>
*
* <Short Description formbean class for login>
*
* <Version Number > 
*
* <Created Date in 23 jun 2011 format>
*
* <Modification History>
*/
package com.ash;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class loginform extends ActionForm
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /**
     * The value is used for String storage.
     * 
     * @see private String username;
     * @see private String password;
     */

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 *using for validation purpose
	 *
	 * @param ActionMapping
	 * @param HttpServletRequest
	 * @return ActionErrors 
	 * @exception OutOfMemoryError If there is not enough memory to
	 * determine coolness. 
	 * @exception SecurityException If the security manager cannot be
	 * created
	 * @see validate(ActionMapping mapping,HttpServletRequest request) 
	 * @see isHip
	 */

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		ActionErrors errors=new ActionErrors();
		ActionError error=null;
		if(username==null || username.length()==0)
		{
			error=new ActionError("login.username.required");
			errors.add("username", error);
		}
		if(password==null || password.length()==0)
		{
			error=new ActionError("login.password.required");
			errors.add("password", error);
		}
		return errors;
	}
}
