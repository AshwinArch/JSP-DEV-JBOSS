package com.ash;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
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
			LoginForm login=(LoginForm)form;
			DataSource ds=getDataSource(request, "orcl");
			Connection con=ds.getConnection();
			boolean status=LoginDAO.authenticateUser(login, con);
			ActionForward forward=null;
			if(status)
			{
				forward=mapping.findForward("success");
			}
			else
			{
				forward=mapping.findForward("failure");
				ActionErrors errors=new ActionErrors();
				ActionError error=new ActionError("login.failed");
				errors.add("login-failed", error);
				saveErrors(request, errors);
				login.setPassword("");
			}
			return forward;
	}
}
