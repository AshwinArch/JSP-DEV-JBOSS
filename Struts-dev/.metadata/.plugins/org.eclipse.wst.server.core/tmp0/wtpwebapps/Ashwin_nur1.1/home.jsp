<%--
  - Author(s):Ashwin
  - Date:23-jun-2011
  - Copyright Notice:
  - @(#)
  - Description:login  page
--%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
		
<center>
	<h2>
		<bean:message key="welcome.key"/>
	</h2>
	
	<hr>
		<font color="red">
			<html:errors/>
		</font>
	<hr>
	
	<html:form action="login">
		<table>
			<tr>
				<td>
					<bean:message key="welcome.uname"/>
				</td>
				<td>
					<html:text property="username"/>
				</td>
			</tr>
			<tr>
				<td>
					<bean:message key="welcome.pword"/>
				</td>
				<td>
					<html:password property="password"/>
				</td>
			</tr>
			<tr>

		</table>
						<html:submit>
								<bean:message key="login.submit"/>
						</html:submit>
						<html:reset>
								<bean:message key="login.reset"/>
						</html:reset>
		
			
				<html:link href="registration.jsp">Sign up!</html:link>
						
	</html:form>
</center>
			
			