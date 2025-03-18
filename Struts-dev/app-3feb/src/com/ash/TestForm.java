package com.ash;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class TestForm extends ActionForm 
{
	private String param1;

	public TestForm()
	{
		System.out.println("TestForm()");
	}
	public String getParam1() {
		System.out.println("Get Param");
		return param1;
	}

	public void setParam1(String param1) {
		System.out.println("Set Param");
		this.param1 = param1;
	}
	
}
