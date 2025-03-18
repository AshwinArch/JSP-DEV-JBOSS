<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
	
<html:errors/>
	<html:form action="login">
			<bean:message key="login.username"/>
			<html:text property="username"/><br>
			<bean:message key="login.password"/>
			<html:password property="password"/><br>
			<html:submit>
					<bean:message key="login.submit"/>
			</html:submit><br>		
	</html:form>