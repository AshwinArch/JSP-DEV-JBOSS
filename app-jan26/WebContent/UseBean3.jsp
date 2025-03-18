
<%@page import="com.ash.Book"%>
<jsp:useBean id="b1" class="com.ash.Book"></jsp:useBean>
<jsp:setProperty property="pages" name="b1" value="410"></jsp:setProperty>

<% 
	Book b2 = (Book)pageContext.getAttribute("b1");
	out.println(b2.getPages());
%>