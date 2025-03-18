package com.ash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class MyTestAction extends Action
{
	public MyTestAction()
	{
		System.out.println("MyTestAction()");
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("execute()");
		MyTestForm mt=(MyTestForm)form;
		System.out.println(mt.getParam());
		return mapping.findForward("path1");
	}
}
