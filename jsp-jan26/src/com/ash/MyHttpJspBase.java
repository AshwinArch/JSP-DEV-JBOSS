package com.ash;

import org.apache.jasper.runtime.HttpJspBase;

@SuppressWarnings("serial")
public abstract class MyHttpJspBase extends HttpJspBase
{
	public final void _jspInit()
	{
		System.out.println("Some Thing");
	}
	public final void _jspDestroy()
	{
		System.out.println("Some Other Thing");
	}
}
