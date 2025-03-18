package com.lara;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class TestForm extends ActionForm
{
	private String param1;
	private String param2;
	public String getParam1()
	{
		return param1;
	}
	public void setParam1(String param1)
	{
		this.param1 = param1;
	}
	public String getParam2() 
	{
		return param2;
	}
	public void setParam2(String param2) 
	{
		this.param2 = param2;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		ActionErrors errors=new ActionErrors();
		ActionError error=null;
		if(param1==null || param1.length()==0)
		{
			error=new ActionError("test-param1-required");
			errors.add("param1", error);
		}
		if(param2==null || param2.length()==0)
		{
			error=new ActionError("test-param2-required");
			errors.add("param2", error);
		}
		return errors;
	}
	
}
