<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>

<html:form action="login" onsubmit="return validateLoginRequest(this)">
	<html:javascript formName="loginRequest"/>
	<bean:message key="login.username"/>
	<html:text property="username"/>
	<html:errors property="username"/><br>
	
	<bean:message key="login.password"/>
	<html:password property="password"/>
	<html:errors property="password"/><br>

	<html:submit>
		<bean:message key="login.submit"/>
	</html:submit>

</html:form>