package com.ash;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class RegForm extends ActionForm
{
	private String gender;
	private String qualification;
	private String[] skills;
	private String username; 
	private String password; 
	
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	public String[] getSkills() 
	{
		return skills;
	}
	public void setSkills(String[] skills) 
	{
		this.skills = skills;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	} 
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		ActionErrors errors=new ActionErrors();
		ActionError error=null;
		if(username==null || username.length()==0)
		{
			error=new ActionError("username.required");
			errors.add("username", error);
		}
		if(password==null || password.length()==0)
		{
			error=new ActionError("password.required");
			errors.add("password", error);
		}
		if(gender==null || gender.length()==0)
		{
			error=new ActionError("gender.required");
			errors.add("gender", error);
		}
		if(skills==null || skills.length==0)
		{
			error=new ActionError("skills.required");
			errors.add("skills", error);
		}
		if(qualification.length()==3 || qualification=="pls" )
		{
			error=new ActionError("qualification.required");
			errors.add("qualification", error);
		}
		return errors;
	}
	 
	
}
