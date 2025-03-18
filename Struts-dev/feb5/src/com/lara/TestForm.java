package com.lara;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class TestForm extends ActionForm
{
	private String param;
	public TestForm()
	{ 
		System.out.println("TestForm()");
	}
	public void setParam(String param)
	{
		System.out.println("setParam()");
		this.param=param;
	}
	public String getParam()
	{
		System.out.println("getParam()");
		return param;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		System.out.println("validate()");
		ActionErrors errors=new ActionErrors();
		ActionError error=null;
		if(param==null ||param.length()==0)
		{
			error=new ActionError("test.required.param");
			errors.add("param", error);
		}
		return errors;
		
	}
}
