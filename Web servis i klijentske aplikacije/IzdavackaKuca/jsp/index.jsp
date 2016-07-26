<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="kuca.*"%>
<%@ page errorPage="greska.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
	<%
		Metode f = new MetodeServiceLocator().getMetode();
		Knjiga[] k = new Knjiga[10];
		
		String filterISBN = "";
		if(request.getParameter("filterISBN") != null)
			filterISBN = request.getParameter("filterISBN");
		String lista = request.getParameter("lista");
		String akcija = request.getParameter("akcija");
		
		String poruka = null;
		
		if(akcija != null)
		{
			if(akcija.equals("Prikazi"))
			{
				try
				{
					k = f.vratiKnjige(filterISBN);
				}
				catch (java.rmi.RemoteException re) 
				{
					throw new Exception("Greska: " + re );
				}
			}

			else if(akcija.equals("Obrisi"))
			{
				try
				{
					if(lista != null)
					{
						f.brisiKnjigu(lista);
						k = f.vratiKnjige("");
					}
					else
						throw new Exception("Morate prvo izabrati knjigu!");
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
			
			else if(akcija.equals("Promeni"))
			{
				try
				{
					if(lista != null)
					{
						k = f.vratiKnjige(lista);
						session.setAttribute("knjiga", k[0]);
						response.sendRedirect("promena.jsp");
					}
					else
						throw new Exception("Morate prvo izabrati knjigu!");
				}
				catch (java.rmi.RemoteException re) 
				{
					throw new Exception("Greska: " + re );
				}
			}
		}
		else
			k = f.vratiKnjige("");
	%>
	<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Knjige - Stevan Cvetkovic</title>
    </head>
    <body>
    	<h3>Prikaz podataka</h3>
        <form method="post" name="filter" action="index.jsp">
            ISBN: <input type="text" name="filterISBN" value="<%=filterISBN %>" />
            <input type="submit" name="akcija" value="Prikazi"/><br />
		</form>
		<form method="post" name="lista" action="index.jsp">
            <select name="lista" id="lista" size="10" style="width:275px">
				<%
                    for(int i=0; i<k.length; i++)
                        out.print("<option value='" + k[i].getISBN() + "'>" + k[i].getISBN() + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + k[i].getNaslov() + "</option>");
                %>
			</select><br />
            <input type="submit" name="akcija" value="Promeni"/>
            <input type="submit" name="akcija" value="Obrisi"/><br />
        </form>
    </body>
</html>
