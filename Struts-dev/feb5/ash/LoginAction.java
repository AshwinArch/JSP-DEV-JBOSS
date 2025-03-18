package com.ash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action
{
	public LoginAction()
	{
		System.out.println("Login Action()");
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Execute()");
		LoginForm login=(LoginForm)form;
		String uid=login.getUsername();
		String pwd=login.getPassword();
		ActionForward forward=null;
		if("lara".equals(uid) && "rst".equals(pwd))
		{
			forward=mapping.findForward("success");
		}
		else
		{
			forward=mapping.findForward("failure");
			ActionErrors errors=new ActionErrors();
			ActionError error=new ActionError("login.failed");
			errors.add("invalid", error);
			saveErrors(request, errors);
			login.setPassword("");
		}
		return forward;
	}
}
