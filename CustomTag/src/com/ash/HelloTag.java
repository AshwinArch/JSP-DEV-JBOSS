package com.ash;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;
public class HelloTag extends TagSupport
{
	private PageContext pc=null;
	@Override
	public void setPageContext(PageContext arg0)
	{
		pc=arg0;	
	}
	/*public int doStartTag() throws JspException
	{
		System.out.println("Do Start Tag");
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspException
	{
		System.out.println("Do End Tag");
		return EVAL_PAGE;
	}*/
}
