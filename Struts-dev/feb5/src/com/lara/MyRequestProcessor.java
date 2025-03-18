package com.lara;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.RequestProcessor;

public class MyRequestProcessor extends RequestProcessor
{
	@Override
	protected boolean processPreprocess(HttpServletRequest request,
			HttpServletResponse response) 
	{
		System.out.println("My Request Processor");
		return true;
	}
}
