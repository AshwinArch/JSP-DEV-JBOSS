package com.ash;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class CaseTag extends TagSupport
{
	private String arg=null;
	private Tag parent=null;
	public void setArg(String arg)
	{
		this.arg = arg;
	}
	@Override
	public void setParent(Tag t)
	{
		parent=t;
	}
	@Override
	public int doStartTag() throws JspException
	{
		SwitchTag st=(SwitchTag)parent;
		String sArg=st.getArg();
		if(arg.equals(sArg))
		{
			return EVAL_BODY_INCLUDE;
		}
		else
		{
			return SKIP_BODY;
		}
	}
}
