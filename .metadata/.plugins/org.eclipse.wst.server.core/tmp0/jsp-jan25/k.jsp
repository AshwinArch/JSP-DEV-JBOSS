<form action="">
Param1:
<input type='text' name='param1'><br>
<input type='submit' value='submit'>
</form>



<% String s = request.getParameter("param1");
	out.println(s);
%>