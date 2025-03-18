package com.ash;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")

public class TestForm extends ActionForm
{
	private String param1;

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}
	
}
