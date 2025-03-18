package com.lara;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class TestForm extends ValidatorForm
{
	private String param;
	private String birthDate;
	private String email;
	private String creditCard;
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		ActionErrors errors=new ActionErrors();
		ActionError error=null;
		if(param==null || param.length()==0)
		{
			error=new ActionError("param required");
			errors.add("param1", error);
		}
		return errors;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getParam() 
	{
		return param;
	}
	public void setParam(String param)
	{
		this.param = param;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
}
