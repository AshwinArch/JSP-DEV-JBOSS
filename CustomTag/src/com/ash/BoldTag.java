package com.ash;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class BoldTag implements Tag
{
	private PageContext pc=null;
	public void setPageContext(PageContext arg0)
	{
		pc=arg0;	
		System.out.println("Set Page Context");
	}
	@Override
	public void setParent(Tag arg0)
	{
		System.out.println("Set Parent");
	}
	@Override
	public Tag getParent()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int doStartTag() throws JspException
	{
	System.out.println("doStartTag");
	JspWriter out=pc.getOut();
	try
	{
		out.println("<b>");
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("Do End Tag");
		JspWriter out=pc.getOut();
		try
		{
			out.println("</b>");
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
			System.out.println("Release");
	}
}
