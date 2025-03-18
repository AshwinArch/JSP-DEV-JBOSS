package com.ash;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm
{
		private String username;
		private String password;
		public String getUsername() 
		{
			return username;
		}
		public void setUsername(String username) 
		{
			this.username = username;
		}
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		@Override
		public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
		{
			ActionErrors errors=new ActionErrors();
			if(username==null || username.length()==0)
			{
				ActionError error=new ActionError("login.required.username");
				errors.add("username", error);
				
			}
			if(password==null || password.length()==0)
			{
				ActionError error=new ActionError("login.required.password");
				errors.add("password", error);
			}
			return errors;
		}
		
}
