function loginValidate()
{
	var myForm=document.forms[0];
	var un=myForm.username;
	if(un.value.length==0)
	{
		alert("Enter Username.");
		un.focus();
		return false();
	}
	var pwd=myForm.password;
	if(pwd.value.length==0)
	{
		alert("Enter Password.");
		pwd.focus();
		return false;
	}
	return true;
}
function validateRegistrationForm()
{
	var myForm=document.forms[0];
	var fn=myForm.firstname;
	if(fn.value.length==0)
	{
		alert("Pls. Enter First Name");
		fn.focus();
		return false;
	}
	var ln=myForm.password;
	if(ln.value.length==0)
	{
		alert("Pls. Enter Password");
		ln.focus();
		return false;
	}
	var add=myForm.address;
	if(add.value.length==0)
	{
		alert("Pls. Enter Address");
		add.focus();
		return false;
	}
	var g1=myForm.gender;
	var flag=true;
	for(var i=0; i<g1.length;i++)
	{
		if(g1[i].checked)
		{
			flag=false;
			break;
		}
		if(flag)
		{
			alert("Pls. select your gender.");
			g1[0].focus();
			return false;
		}
	}
	var c1=myform.skills;
	flag=true;
	for(var i=0; i<s1.length; i++)
	{
		if(s1[i].checked)
		{
			flag=false;
			break;
		}
	}
		if(flag)
		{
			alert("Pls. Select Atleast One Skills.");
			s1[0].focus;
			return false;
		}
	
		var educ=myForm.education;
		if(educ.value=="pls")
		{
			alert("Pls. Select Latest Education.");
			educ[0].focus;
			return false;
		}
		var res=myForm.resume;
		if(educ.value.length==0)
		{
			alert("Pls. Select Resume.");
			res.focus;
			return false;
		}
		return true;
	}

function selectFirstNameInRegForm()
{
	document.forms[0].firstname.focus();
}
function selectUserNameInLoginForm()
{
	document.forms[0].firstname.focus();
}
function trim(field)
{
	var value=field.value;
	var first=value.charAt(0);
	while(first==" ")
	{
		value=value.subString(1, value.length);
		first=value.charAt(0);
	}
	var last=value.charAt(value.length-1);
	while(last==" ")
	{
		value=value.subString(1, value.length-1);
		first=value.charAt(value.length-1);
	}
	field.value=value;
}
function validateAndSubmit()
{
	var myForm=document.forms[0];
	var fn=myForm.firstname;
	if(fn.value.length==0)
	{
		alert("First name is required one...");
		fn.focus();
		return false;
	}
	var ln=myForm.lastname;
	if(ln.value.length==0)
	{
		alert("Last name is required one...");
		ln.focus();
		return false;
	}
	var email=myForm.email;
	if(email.value.length==0)
	{
		alert("Email is required one...");
		email.focus();
		return false;
	}
	myForm.submit();
}
function validateAndSubmitInEnter()
{
	var key=event.keyCode;
	if(key==13)
	{
		var myForm=document.forms[0];
		var fn=myForm.firstName;
		if(fn.value.length==0)
		{
			alert("First Name is required one");
			fn.focus();
			return false;
		}
		var ln=myform.lastName;
		if(ln.value.length==0)
		{
			alert("LastName is required one");
			ln.focus();
			return false;
		}
		var email=myForm.email;
		if(email.value.length==0)
		{
			alert("email is required one..");
			email.focus();
			return false;
		}
	}
	myForm.submit();
}
function look4numerics()
{
	var key=event.keyCode;
	if(key<48 ||key>57)
	{
		alert("Pls enter numerics only.");
		event.keyCode=null;
	}
}
function selectAll()
{
	var myForm=document.forms[0];
	var all=myForm.all;
	var records=myForm.record;
	if(all.checked)
	{
		for(var i=0;i<records.length;i++)
		{
			records[i].checked=true;
		}
	}
	else
	{
		for(var i=0;i<records.length;i++)
		{
			records[i].checked=false;
		}
	}
}
function verifyAll()
{
	var myForm=document.forms[0];
	var all=myForm.all;
	var records=myForm.record;
	var flag=true;
	for(var i=0;i<records.length;i++)
	{
		if(!records[i].checked)
		{
			flag=false;
			break;
		}
	}
	all.checked=flag;
}
function modifyDev()
{
	var v1=document.forms[0].test;
	if(v1.checked)
	{
		document.getElementById('mainDiv').innerHTML="checked";
	}
	else
	{
		document.getElementById("mainDiv").innerHTML="unchecked";
	}
}
function swap2Divs()
{
	var s1=document.getElementById("d1").innerHTML;
	var s2=document.getElementById("d2").innerHTML;
	document.getElementById("d1").innerHTML=s2;
		document.getElementById("d2").innerHTML=s1;
}
function checkStateSelection()
{
	var myForm=document.forms[0];
	var state=myForm.state;
	if(state.value=="pls")
	{
		alert("Pls. Select State First");
		state.focus();
		return false;
	}
}

function populateDistricts()
{
	var myForm=document.forms[0];
	var st=myForm.state;
	var stateValue=st.value;
	document.getElementById("district").innerHTML=document.getElementById(stateValue).innerHTML;
}
	