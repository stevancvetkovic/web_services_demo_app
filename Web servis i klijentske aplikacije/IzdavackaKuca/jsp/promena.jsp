<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="kuca.*"%>
<%@ page errorPage="greska.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
	<%
		Metode f = new MetodeServiceLocator().getMetode();
		Knjiga a = (Knjiga) session.getAttribute("knjiga");
		
		String akcija = request.getParameter("akcija");
		String isbn = request.getParameter("isbn");
		String brojStrana = request.getParameter("brojStrana");
		String opis = request.getParameter("opis");
		String ocena = request.getParameter("ocena");
		
		if(akcija != null)
		{
			if(akcija.equals("Sacuvaj"))
			{
				if(isbn != null || brojStrana != "" || opis != null || ocena != null)
				{
					try
					{
						f.promeniKnjigu(isbn, Integer.parseInt(brojStrana), opis, Double.parseDouble(ocena));
						response.sendRedirect("index.jsp");
					}
					catch (NePostojiException npe)
					{
						throw new NePostojiException(npe.getPoruka());
					}
					catch (java.rmi.RemoteException re)
					{
						throw new Exception("Greska: " + re );
					}
				}
			}
			else if(akcija.equals("Otkazi"))
				response.sendRedirect("index.jsp");
		}
	%>
<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Promena podataka - Stevan Cvetkovic</title>
    </head>
    <body>
    	<h3>Promena podataka</h3>
        <form method="post" action="promena.jsp">
        	<table border="0">
        		<tr>
        			<td>ISBN:</td>
        			<td><input type="text" name="isbn" value="<%=a.getISBN()%>" readonly /></td>
        		</tr>
				<tr>
        			<td>Naslov:</td>
        			<td><input type="text" name="naslov" value="<%=a.getNaslov()%>" readonly /></td>
        		</tr>
        		<tr>
        			<td>Broj strana:</td>
        			<td><input type="text" name="brojStrana" value="<%=a.getBrojStrana()%>" /></td>
        		</tr>
        		<tr>
        			<td>Opis:</td>
        			<td><input type="text" name="opis" value="<%=a.getOpis()%>" /></td>
        		</tr>
        		<tr>
        			<td>Ocena:</td>
        			<td><input type="text" name="ocena" value="<%=a.getOcena()%>" /></td>
        		</tr>
        	</table>
            <input type="submit" name="akcija" value="Sacuvaj"/>
            <input type="submit" name="akcija" value="Otkazi"/>
        </form>
    </body>
</html>