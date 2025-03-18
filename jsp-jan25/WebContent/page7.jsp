
<%@page import="java.io.PrintWriter"%><%@ page isErrorPage="true" %>

<% 
	PrintWriter pout=response.getWriter();
	exception.printStackTrace(pout); %>