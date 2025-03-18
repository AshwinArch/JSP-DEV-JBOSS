package com.ash;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
public class NumericTextFieldTag implements Tag
{
	private PageContext pc=null;
	private String type=null;
	private String name=null;
	public void setPageContext(PageContext arg0)
	{
		pc=arg0;
	}
	public void setParent(Tag arg0)
	{	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Tag getParent()
	{
		return null;
	}
	public int doStartTag() throws JspException
	{
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspException
	{
		JspWriter out=pc.getOut();
		try
		{
			out.println("<input type = '"+type+"' name = '"+name+"' onKeyPress = 'look4Numeric()'>");
			out.println("<script>");
			out.println("function look4Numeric()");
			out.println("{");
			out.println("var key = event.keyCode;");
			out.println("if(key<48 || key>57)");
			out.println("{");
			out.println("event.keyCode=null;");
			out.println("alert (\"Pls Enter Number Only\");");
			out.println("}");
		/*	out.println("else");
			out.println("{");
			out.println("alert(\"Perfect\")");
			out.println("}");*/
			out.println("}");
			out.println("</script>");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	public void release()
	{	}
}
