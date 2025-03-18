package com.ash;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SwitchTag extends TagSupport
{
	private String arg=null;
	public void setArg(String arg)
	{
		this.arg = arg;
	}
	public String getArg()
	{
		return arg;
	}
	public int doStartTag() throws JspException
	{
		return EVAL_BODY_INCLUDE;
	}
}
