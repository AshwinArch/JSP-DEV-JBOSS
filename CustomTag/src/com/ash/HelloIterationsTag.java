package com.ash;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class HelloIterationsTag implements IterationTag
{
	private PageContext pc=null;
	private int loopIndex=5;
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
	public int doStartTag() throws JspException
	{
		JspWriter out=pc.getOut();
		System.out.println("Do start tag");
		try
		{
			out.println("From do start body<br>");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doAfterBody() throws JspException
	{
		System.out.println("Do After Body");
		JspWriter out=pc.getOut();
		try
		{
			out.println("Form Do after body<br>");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		if(loopIndex>0)
		{
			loopIndex--;
			return EVAL_BODY_AGAIN;
		}
		else
		{
			return SKIP_BODY;
		}
	}
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("Do end tag");
		JspWriter out=pc.getOut();
		try
		{
			out.println("Form doEndTag<br>");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	@Override
	public void release()
	{
		System.out.println("release");
	}
}
