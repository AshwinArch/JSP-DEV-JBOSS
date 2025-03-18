package com.ash;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport
{
	private PageContext pc=null;
	public void setPageContext(PageContext pageContext)
	{
		pc=pageContext;
	}
	public int doStartTag() throws JspException
	{
		pc.setAttribute("test", "abc");
		pc.setAttribute("test1", "123");
		return EVAL_BODY_INCLUDE;
	}
	
}
