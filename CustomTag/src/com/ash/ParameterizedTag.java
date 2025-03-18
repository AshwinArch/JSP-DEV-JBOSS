package com.ash;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ParameterizedTag implements Tag
{
	private PageContext pc=null;
	private String param1=null;
	private String param2=null;
	private Integer param3=null;
	public void setPageContext(PageContext arg0)
	{
		System.out.println("SET PAGE CONTEXT");
		pc=arg0;
	}
	@Override
	public void setParent(Tag arg0)
	{
		System.out.println("SET PARENT");	
	}
	/**
	 * @param param1 the param1 to set
	 */
	public void setParam1(String param1)
	{
		System.out.println("PARAM1");
		this.param1 = param1;
	}
	/**
	 * @param param2 the param2 to set
	 */
	public void setParam2(String param2)
	{
		System.out.println("PARAM2");
		this.param2 = param2;
	}
	/**
	 * @param param3 the param3 to set
	 */
	public void setParam3(Integer param3)
	{
		System.out.println("PARAM3");
		this.param3 = param3;
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
		System.out.println("DO START TAG");	
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("DO END TAG");
		JspWriter out=pc.getOut();
		try
		{
			out.println("PARAM1 : "+param1+"<br>");
			out.println("PARAM2 : "+param2+"<br>");
			out.println("PARAM3 : "+param3+"<br>");
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
		System.out.println("RELEASE");	
	}
}
