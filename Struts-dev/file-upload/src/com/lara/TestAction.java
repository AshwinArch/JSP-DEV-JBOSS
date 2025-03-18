package com.lara;

import java.io.BufferedInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

public class TestAction extends Action 
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		TestForm test=(TestForm) form;
		FormFile p1=test.getParam1();
		InputStream fin=p1.getInputStream();
		BufferedInputStream bin=new BufferedInputStream(fin);
		byte b[]=new byte[(int)p1.getFileSize()];
		bin.read(b);
		System.out.println(b.length);
		return mapping.findForward("success");
	}
}
