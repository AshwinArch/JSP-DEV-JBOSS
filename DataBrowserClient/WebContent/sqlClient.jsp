<jsp:useBean id="client" class="com.lara.SQLClient" scope="session"/>
<jsp:setProperty property="driverClass" name="client" 
			value="oracle.jdbc.driver.OracleDriver"/>
<jsp:setProperty property="url" name="client" 
			value="jdbc:oracle:thin:@localhost:1521:XE"/>
<jsp:setProperty property="user" name="client" 
			value="system"/>
<jsp:setProperty property="password" name="client" 
			value="123"/>
<%-- this is just for declaration --%>
<%  String sql=request.getParameter("sql");
	String results=null;
	if(sql!=null)
	{
		results=client.getResults(sql);
	}
	else
	{
		sql="";
	}
%>
<%--- Form functioning --%>
<form action="" method="post">
<%=client.getListOfSQLQueries()%>
<br>
SQL Query:
<textarea rows="4" cols="50" name="sql" ><%=sql%></textarea>
<input type='submit' value='submit'></input>
</form>
<%
	if(sql.length()>0)
	{
		out.println(results);
	}
%>
