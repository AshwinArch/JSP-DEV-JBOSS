<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<html:errors/>
<%--<form action="login.do">
		<bean:message key="login.username"/>
		<input type='text' name='username'><br>
				<bean:message key="login.password"/>
		<input type='password' name='password'><br>
		<input type='submit' value='submit'>
</form>--%>



<html:form action="login">
		<bean:message key="login.username"/>
		<html:text property="username"/><br>
		<bean:message key="login.password"/>
		<html:password property="password"/>
		<input type='submit' value='submit'><br>
</html:form>