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
				<td>
					<bean:message key="login.gender"/>
				</td>
				<td>
					<html:radio property="gender" value="male">Male</html:radio>
					<html:radio property="gender" value="female">Female</html:radio>
				</td>
			</tr>
	
			<tr>
				<td>
					<bean:message key="login.skills"/>
				</td>
				<td>
					<html:checkbox property="skills" value="c">C</html:checkbox>
					<html:checkbox property="skills" value="cpp">C++</html:checkbox>
					<html:checkbox property="skills" value="java">JAVA</html:checkbox>
					<html:checkbox property="skills" value="android">Android</html:checkbox>
				</td>
			</tr>
			
					<tr>
				<td>
					<bean:message key="login.qualification"/>
				</td>
				<td>
					<html:select property="qualification" >
					<html:option value="pls">Pls. Select</html:option>
					<html:option value="be">B.E</html:option>
					<html:option  value="me">M.E</html:option>
					<html:option  value="btech">B.Tech</html:option>
					<html:option  value="mtech">M.Tech</html:option>
					</html:select>
				</td>
			</tr>
			
			<tr>
				<td>
					<html:submit>
							<bean:message key="login.submit"/>
					</html:submit>
				</td>
				<td>
					<html:reset>
							<bean:message key="login.reset"/>
					</html:reset>
				</td>
			</tr>
		</table>
	</html:form>
</center>
		