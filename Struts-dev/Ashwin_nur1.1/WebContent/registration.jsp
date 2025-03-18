<%--
  - Author(s):Ashwin
  - Date:23-jun-2011
  - Copyright Notice:
  - @(#)
  - Description:registration page
--%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
	<center>
	<h2>
		<bean:message key="reg.title"/>
	</h2>
	<html:form action="reg">
		<table>
			
			<tr>
				<td>
					<bean:message key="reg.title1"/>
				</td>
				<td>
					<html:radio property="t1" value="Mr">Mr.</html:radio>
					<html:radio property="t1" value="Mrs">Mrs.</html:radio>
					<html:radio property="t1" value="Miss">Miss.</html:radio>
				</td>
				<td><font color="red">
					<html:errors property="t1"/>
					</font>	</td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.firstname" />
				</td>
				<td>
					<html:text property="firstname" value=" " />
				</td>
				<td><font color="red">
					<html:errors property="firstname" /></font>
				</td>
			</tr>
			<tr>
				<td>
					<bean:message key="reg.lastname"/>
				</td>
				<td>
					<html:text property="lastname" value=" "/>
				</td>
					<td><font color="red"><html:errors property="lastname"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.username"/>
				</td>
				<td>
					<html:text property="username" value=" "/>
				</td><td><font color="red"><html:errors property="username"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.password"/>
				</td>
				<td>
					<html:password property="password" value=""/>
				</td><td><font color="red"><html:errors property="password"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.email"/>
				</td>
				<td>
					<html:text property="email" value=" "/>
				</td><td><font color="red"><html:errors property="email"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.address"/>
				</td>
				<td>
					<html:textarea property="address" value=" "/>
				</td><td><font color="red"><html:errors property="address"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.contact" />
				</td>
				<td>
					<html:text property="contact" value="" />
				</td><td><font color="red"><html:errors property="contact"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.city"/>
				</td>
				<td>
					<html:text property="city" value=" "/>
				</td><td><font color="red"><html:errors property="city"/></font></td>
			</tr>
				
			<tr>
				<td>
					<bean:message key="reg.state"/>
				</td>
				<td>
					<html:text property="state" value=" "/>
				</td><td><font color="red"><html:errors property="state"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.coun_id"/>
				</td>
				<td>
					<html:select property="coun_id">
						<html:option value="0">Pls. Select</html:option>
						<html:option value="1">India</html:option>
						<html:option  value="2">USA</html:option>
						<html:option  value="3">Russia</html:option>
					</html:select>
				</td><td><font color="red"><html:errors property="coun_id"/></font></td>
			</tr>
			
			<tr>
				<td>
					<bean:message key="reg.interest"/>
				</td>
				<td>
					<html:select property="interest">
						<html:option value="pls">Pls. Select</html:option>
						<html:option value="mechanical">mech</html:option>
						<html:option  value="electronics">elec</html:option>
						<html:option  value="software">soft</html:option>
					</html:select>
				</td><td><font color="red"><html:errors property="interest"/></font></td>
			</tr>
			
			
			<tr>
				<td>
					<bean:message key="reg.pincode"/>
				</td>
				<td>
					<html:text property="pincode" value=""/>
				</td><td><font color="red"><html:errors property="pincode"/></font></td>
			</tr>
			
			<tr>
				<td>
					<html:checkbox property="subs" value="Yes">Newspaper subscription ?</html:checkbox>
				</td>
			</tr>
			
			<tr>
				<td>
					<html:submit>
							<bean:message key="reg.submit"/>
					</html:submit>
				</td>
				<td>
					<input type="reset" value="Reset"/>
				</td>
			</tr>
		
		</table>
		
	</html:form>
	
</center>
		