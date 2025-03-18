package com.ash;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class MyTestForm extends ActionForm
{
	private String param;

	public String getParam() 
	{
		System.out.println("getParam()");
		return param;
	}
	public void setParam(String param) 
	{
		System.out.println("setParam()");
		this.param = param;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		System.out.println("validate()");
		ActionErrors errors=new ActionErrors();
		if(param==null  || param.length()==0)
		{
			ActionError error=new ActionError("test2.param.required");
			errors.add("param" ,error);
		}
		return errors;
	}
}
