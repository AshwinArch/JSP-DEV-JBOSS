package com.ash;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class MyIterationsTag implements IterationTag
{
	private PageContext pc=null;
	private int Index=5;
	public void setPageContext(PageContext arg0)
	{
		System.out.println("Set page context");
		pc=arg0;
	}
	@Override
	public void setParent(Tag arg0)
	{
		System.out.println("Set parent");	
	}
	public Tag getParent()
	{
		System.out.println("Get parent");
		return null;
	}
	public void setIndex(int index)
	{
		System.out.println("SetIndex");
		Index = index;
	}
	public int doStartTag() throws JspException
	{
		System.out.println("Do start tag");
		return EVAL_BODY_INCLUDE;
	}
	public int doAfterBody() throws JspException
	{
		System.out.println("Do After Body");
		if(Index>0)
		{
			Index--;
			return EVAL_BODY_AGAIN;
		} 
		else
		{
			return SKIP_BODY;
		}
	}
	public int doEndTag() throws JspException
	{
		System.out.println("Do end tag");
		return EVAL_PAGE;
	}
	public void release()
	{
		System.out.println("release");
	}
}
