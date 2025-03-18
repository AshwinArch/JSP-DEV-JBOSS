<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
		
<center>
	
	<h2>
		<blink>
			<bean:message key="welcome.key"/>
		</blink>
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
				<td>
						<html:submit>
								<bean:message key="login.submit"/>
						</html:submit>
				</td>
				<td>
						<html:reset >
								<bean:message key="login.reset"/>
						</html:reset>
				</td>
			</tr>

		</table>
			
				<html:link href="registration.jsp">Sign up!</html:link>
						
	</html:form>
</center>
			
			