<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Greska!</title>
	</head>
	<body>
		<h1>Greska!</h1>
		<hr>
		<h2>Doslo je do greske:<br />
		<font color=red>
			<%= exception.toString() %>
		</font>
		</h2>
		<br />
		<a href="javascript:location.reload(true)">Vratite se nazad</a>
	</body>
</html>