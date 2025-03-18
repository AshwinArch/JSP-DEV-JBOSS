package com.ash;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class MyBodyTag implements BodyTag
{
	private PageContext pc=null;
	private BodyContent bc=null;
	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("Set Page Context");
		this.pc=arg0;
	}
	@Override
	public void setParent(Tag arg0)
	{
		System.out.println("Set Parent");
	}
	@Override
	public Tag getParent()
	{
		System.out.println("Get Parent");
		return null;
	}
	@Override
	public int doStartTag() throws JspException
	{
		System.out.println("Do Start Tag");
		return EVAL_BODY_BUFFERED;
	}
	@Override
	public void setBodyContent(BodyContent arg0)
	{
		System.out.println("Body");
		bc=arg0;
	}
	@Override
	public void doInitBody() throws JspException
	{
		System.out.println("Do Init Body");
	}
	@Override
	public int doAfterBody() throws JspException
	{
		JspWriter out=bc.getEnclosingWriter();
		String s1=bc.getString();
		s1=new StringBuffer(s1).reverse().toString();
		try
		{
			out.println(s1);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Do After Body");
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("Do End Tag");
		return EVAL_PAGE;
	}
	@Override
	public void release()
	{
		System.out.println("Release");
	}
}
