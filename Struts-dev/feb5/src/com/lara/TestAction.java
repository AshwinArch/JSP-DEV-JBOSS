package com.lara;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestAction extends Action 
{
	public TestAction()
	{
		System.out.println("TestAction()");
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Execute()");
		TestForm test=(TestForm)form;
		String p1=test.getParam();
		
		MyActionMapping ma=(MyActionMapping)mapping;
		String da=ma.getDriverClass();
		System.out.println(da);
		
		System.out.println(p1);
		return mapping.findForward("success");
	}
}
