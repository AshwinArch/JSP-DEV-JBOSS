package com.lara;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class MyDispatchAction extends DispatchAction
{
		public ActionForward create(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception
		{
			System.out.println("Create");
			return mapping.findForward("success");
		}
		public ActionForward read(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception
		{
			System.out.println("Read");
			return mapping.findForward("success");
		}
		public ActionForward update(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception
		{
			System.out.println("Update");
			return mapping.findForward("success");
		}
		public ActionForward delete(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception
		{
			System.out.println("Delete");
			return mapping.findForward("success");
		}
}
