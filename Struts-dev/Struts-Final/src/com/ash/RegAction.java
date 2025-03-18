package com.ash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
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
		String s=reg.getFirstname();
		String s1=reg.getLastname();
		System.out.println(s);
		System.out.println(s1);
		return mapping.findForward("Success");
		
	}
}
