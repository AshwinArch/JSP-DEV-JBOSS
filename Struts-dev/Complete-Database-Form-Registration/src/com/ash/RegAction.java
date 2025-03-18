package com.ash;

import java.sql.Array;
import java.sql.Connection;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		RegForm reg=(RegForm)form;
		String un=reg.getUsername();
		String pw=reg.getPassword();
		String gen=reg.getGender();
		String[] skill=reg.getSkills();
		String qua=reg.getQualification();
		System.out.println(un);
		System.out.println(pw);
		System.out.println(gen);
		System.out.println(Arrays.toString(skill));
		System.out.println(qua);
		
		DataSource ds=getDataSource(request, "orcl");
		Connection con=ds.getConnection();
		boolean status=LoginDAO.authenticateUser(reg, con);
		ActionForward forward=null;
		
		if(status)
		{
			forward=mapping.findForward("success");
		}
		else
		{
			forward=mapping.findForward("failure");
			ActionErrors errors=new ActionErrors();
			ActionError error=new ActionError("data.inserted");
			errors.add("data-inserted", error);
			saveErrors(request, errors);
			reg.setPassword("");
		}
		return forward;
	}
}
