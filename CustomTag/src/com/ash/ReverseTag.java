package com.ash;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ReverseTag implements Tag
{
	private PageContext pc=null;
	private String param=null;
	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("SET PAGE CONTEXT");
		pc=arg0;	
	}
	public void setParent(Tag arg0)
	{
		System.out.println("SET PARENT");		
	}
	/**
	 * @param param the param to set
	 */
	public void setParam(String param)
	{
		System.out.println("SET PARAM");
		this.param = param;
	}
	@Override
	public Tag getParent()
	{
		System.out.println("GET PARENT");
		return null;
	}
	@Override
	public int doStartTag() throws JspException
	{
		JspWriter out=pc.getOut();
		try
		{
			String s1=new StringBuffer(param).reverse().toString();
			out.println(s1);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("DO START TAG");
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("DO END TAG");
		return EVAL_PAGE;
	}
	@Override
	public void release()
	{
		System.out.println("RELEASE");
	}
}
