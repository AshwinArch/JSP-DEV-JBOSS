package com.lara;

import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class MyActionMapping extends ActionMapping
{
	private String driverClass;
	public String getDriverClass() 
	{
		return driverClass;
	}
	public void setDriverClass(String driverClass)
	{
		this.driverClass = driverClass;
	}
}
