package com.ash;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class RegForm extends ActionForm 
{private static final long serialVersionUID = 1L;
	
//variable declaration.............
	
	private String t1;
	private int pincode;
	private String firstname;
	private String lastname;
	private String username; 
	private String password; 
	private String email; 
	private String address; 
	private String city; 
	private String state; 
	private int coun_id; 
	private String interest; 
	private int contact; 
	private String subs;
	
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getSubs() {
		return subs;
	}
	public void setSubs(String subs) {
		this.subs = subs;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getCoun_id() {
		return coun_id;
	}
	public void setCoun_id(int coun_id) {
		this.coun_id = coun_id;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) 
	{
		ActionErrors errors=new ActionErrors();
		
		if(address==null && address.length()==0)
		{
			ActionError error=new ActionError("reg.address.reuired");
			errors.add("address", error);
		}
		if((username==null && username.length()==0) || username.length()>=30 )
		{
			ActionError error=new ActionError("reg.username.reuired");
			errors.add("username", error);
		}
		if(t1==null && t1.length()==0)
		{
			ActionError error=new ActionError("reg.t1.reuired");
			errors.add("t1", error);
		}
		if((state==null && state.length()==0 ) || state.length()>=30)
		{
			ActionError error=new ActionError("reg.state.reuired");
			errors.add("state", error);
		}
		if((password==null && password.length()==0) || password.length()>=30)
		{
			ActionError error=new ActionError("reg.password.reuired");
			errors.add("password", error);
		}
		if((lastname==null && lastname.length()==0) || lastname.length()>=30)
		{
			ActionError error=new ActionError("reg.lastname.reuired");
			errors.add("lastname", error);
		}
		if(interest==null && interest.length()==0)
		{
			ActionError error=new ActionError("reg.interest.reuired");
			errors.add("interest", error);
		}
		if((firstname==null && firstname.length()==0) || firstname.length()>=30)
		{
			ActionError error=new ActionError("reg.firstname.reuired");
			errors.add("firstname", error);
		}
		if((email==null && email.length()==0) || email.length()>=30)
		{
			ActionError error=new ActionError("reg.email.reuired");
			errors.add("email", error);
		}
		if(coun_id==0)
		{
			ActionError error=new ActionError("reg.country_id.reuired");
			errors.add("country", error);
		}
		if(pincode==0)
		{
			ActionError error=new ActionError("reg.pincode.reuired");
			errors.add("pincode", error);
		}
		if(contact==0 )
		{
			ActionError error=new ActionError("reg.contact.reuired");
			errors.add("contact", error);
		}
		if((city==null && city.length()==0) || city.length()>=30)
		{
			ActionError error=new ActionError("reg.city.reuired");
			errors.add("city", error);
		}
		return errors;
	}
	
}
