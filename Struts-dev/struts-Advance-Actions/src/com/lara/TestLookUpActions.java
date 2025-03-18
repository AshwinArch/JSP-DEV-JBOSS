package com.lara;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

public class TestLookUpActions extends LookupDispatchAction
{
	
	@SuppressWarnings("unchecked")
	protected Map getKeyMethodMap() 
	{
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("create.submit", "Create");
		map.put("read.submit", "Read");
		map.put("update.submit", "Update");
		map.put("delete.submit", "Delete");
		return map;
	}
	
	//usual methods
	public ActionForward Create(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Create");
		return mapping.findForward("succ");
	}
	public ActionForward Read(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Create");
		return mapping.findForward("succ");
	}
	public ActionForward Update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Create");
		return mapping.findForward("succ");
	}
	public ActionForward Delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Create");
		return mapping.findForward("succ");
	}
}
