package com.ash;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

import com.sun.org.apache.xpath.internal.operations.Variable;

public class MyVariablesInfo extends TagExtraInfo
{
	public VariableInfo[] getVariableInfo(TagData data)
	{
		VariableInfo[] all=null;
		all=new VariableInfo[2];
		VariableInfo v1=null;
		VariableInfo v2=null;
		v1=new VariableInfo("test", "String", true, VariableInfo.AT_BEGIN);
		v2=new VariableInfo("test1", "String", true, VariableInfo.AT_BEGIN);
		all[0]=v1;
		all[1]=v2;
		return all;
	}
}
