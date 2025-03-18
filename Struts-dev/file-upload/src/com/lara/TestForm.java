package com.lara;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class TestForm extends ActionForm
{
	private FormFile param1;

	public FormFile getParam1() {
		return param1;
	}
	public void setParam1(FormFile param1) {
		this.param1 = param1;
	}
	
}
