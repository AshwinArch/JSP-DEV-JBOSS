package com.ash;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class DateTag implements Tag
{
	private PageContext pc=null;
	public void setPageContext(PageContext arg0)
	{
		System.out.println("Set Page Context");	
		pc=arg0;
	}
	public void setParent(Tag arg0)
	{
		System.out.println("Set Parent");	
	}
	public Tag getParent()
	{
		System.out.println("getParent");	
	return null;
	}
	public int doStartTag() throws JspException
	{
		JspWriter out=pc.getOut();
		try
		{
			Date date=new Date();
			out.println("<b> Date :"+date+"</b>");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("doStartTag");
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspException
	{
		System.out.println("Do End Tag");
		return EVAL_PAGE;
	}
	public void release()
	{
		System.out.println("Release");
	}
}
