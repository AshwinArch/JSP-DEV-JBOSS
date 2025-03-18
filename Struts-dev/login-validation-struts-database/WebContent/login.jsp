<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>

<center>
	<h2>
		<bean:message key="login.title"/>
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
					<bean:message key="login.username"/>
				</td>
				<td>
					<html:text property="username"/>
				</td>
			</tr>
			<tr>
				<td>
					<bean:message key="login.password"/>
				</td>
				<td>
					<html:password property="password"/>
				</td>
			</tr>
			<tr>
				<td colspan='2' align='center'>
					<html:submit>
							<bean:message key="login.submit"/>
					</html:submit>
				</td>
			</tr>
		</table>
	</html:form>
</center>
			
			