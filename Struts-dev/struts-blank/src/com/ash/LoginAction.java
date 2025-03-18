package com.ash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class LoginAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		LoginForm login=(LoginForm) form;
		String uid=login.getUsername();
		String pwd=login.getPassword();
		System.out.println("Username: "+uid);
		System.out.println("Password: "+pwd);
		return mapping.findForward("success");
	}
}
