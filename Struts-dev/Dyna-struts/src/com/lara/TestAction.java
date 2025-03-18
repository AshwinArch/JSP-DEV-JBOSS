package com.lara;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class TestAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		DynaActionForm daf=(DynaActionForm)form;
		String p1=(String)daf.get("param");
		System.out.println(p1);

		String s1=null;
		System.out.println(s1.length());
		
		return mapping.findForward("success");
	}
}
