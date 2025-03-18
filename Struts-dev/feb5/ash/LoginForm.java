package com.ash;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class LoginForm extends ActionForm
{
	private String username;
	private String password;
	public String getUsername() 
	{
		System.out.println("getUsername");
		return username;
	}
	public void setUsername(String username)
	{
		System.out.println("setUsername");
		this.username = username;
	}
	public String getPassword() 
	{
		System.out.println("getPassword");
		return password;
	}
	public void setPassword(String password) 
	{
		System.out.println("setPassword");
		this.password = password;
	}
	public LoginForm()
	{
		System.out.println("LoginFrom()");
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) 
	{
		ActionErrors errors=new ActionErrors();
		ActionError error=null;
		System.out.println("Validtae()");
		if(username==null || username.length()==0)
		{
			error=new ActionError("login.username.required");
			errors.add("username" ,error);
		}
		if(password==null || password.length()==0)
		{
			error=new ActionError("login.password.required");
			errors.add("password" ,error);
		}
		return errors;
	}
	
}
