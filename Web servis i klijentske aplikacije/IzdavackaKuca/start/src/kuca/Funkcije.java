package kuca;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import org.xml.sax.*;

public class Funkcije implements Metode, Serializable
{
    /*public static void main(String[] args)
    {
        Funkcije n = new Funkcije();
		Knjiga[] lista = new Knjiga[0];

        lista = n.vratiKnjige("97");

        for (int i=0; i<lista.length; i++)
		{
			lista[i].printKnjiga();
		}
		
		try
		{
			//n.promeniKnjigu("977678892", 1, "Test!", 10.0);
			//n.brisiKnjigu("977678892");
		}
		catch(NePostojiException npe)
		{
			throw new NePostojiException("Ne postoji knjiga sa zadatim ISBN brojem!");
		}
    }*/

    public Knjiga[] vratiKnjige(String filterISBN)
    {
        Knjiga[] lista = new Knjiga[0];
        Sax handler = new Sax();
        handler.filterKnjiga.setISBN(filterISBN);
        SAXParserFactory factory = SAXParserFactory.newInstance();
        {
            try
            {
                SAXParser saxParser = factory.newSAXParser();
                saxParser.parse(new File("knjige.rdf"), handler);
                Sax sm = (Sax)handler;

                lista = new Knjiga[sm.brojKnjiga];
                for (int i=0; i<sm.brojKnjiga; i++)
                {
                    lista[i] = new Knjiga();
                    lista[i] = sm.nizKnjiga[i];
                }
            }
            catch (SAXException spe)
            {
                System.out.println("\n** Parsing error" + ", line " + spe.getMessage() + ", uri " + spe.getMessage());
            }
            catch (Throwable t)
            {
                 t.printStackTrace();
            }
        }
        return lista;
    }

    public void promeniKnjigu(String ISBN, int brojStrana, String opis, double ocena) throws NePostojiException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Dom dm = new Dom();
            dm.document = builder.parse(new File("knjige.rdf"));

            dm.promeniK(ISBN, brojStrana, opis, ocena);

            TransformerFactory xformFactory = TransformerFactory.newInstance();
            Transformer idTransform = xformFactory.newTransformer();
            Source input = new DOMSource(dm.document);
            Result output = new StreamResult("knjige.rdf");
            idTransform.transform(input, output);
        }
        catch(NePostojiException npe)
		{
			throw new NePostojiException(npe.getPoruka());
		}
        catch (SAXParseException spe)
        {
            System.out.println("\n** Parsing error"
                            + ", line " + spe.getLineNumber()
                            + ", uri " + spe.getSystemId());
            System.out.println(" " + spe.getMessage() );
            Exception x = spe;
            if (spe.getException() != null)
                    x = spe.getException();
            x.printStackTrace();
        }
        catch (SAXException sxe)
        {
            Exception x = sxe;
            if (sxe.getException() != null)
                    x = sxe.getException();
            x.printStackTrace();
        }
        catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch (TransformerConfigurationException e)
        {
            System.out.println("This DOM does not support transforms.");
        }
        catch (TransformerException e)
        {
            System.out.println("Transform failed.");
        }
    }
    
    public void brisiKnjigu(String ISBN) throws NePostojiException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Dom dm = new Dom();
            dm.document = builder.parse(new File("knjige.rdf"));

            dm.brisiK(ISBN);

            TransformerFactory xformFactory = TransformerFactory.newInstance();
			Transformer idTransform = xformFactory.newTransformer();
			Source input = new DOMSource(dm.document);
			Result output = new StreamResult("knjige.rdf");
			idTransform.transform(input, output);
		}
        catch(NePostojiException npe)
		{
			throw new NePostojiException("Ne postoji knjiga sa zadatim ISBN brojem!");
		}
        catch (SAXParseException spe)
        {
            System.out.println("\n** Parsing error"
                            + ", line " + spe.getLineNumber()
                            + ", uri " + spe.getSystemId());
            System.out.println(" " + spe.getMessage() );
            Exception x = spe;
            if (spe.getException() != null)
                    x = spe.getException();
            x.printStackTrace();
        }
        catch (SAXException sxe)
        {
            Exception x = sxe;
            if (sxe.getException() != null)
                    x = sxe.getException();
            x.printStackTrace();
        }
        catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch (TransformerConfigurationException e)
        {
            System.out.println("This DOM does not support transforms.");
        }
        catch (TransformerException e)
        {
            System.out.println("Transform failed.");
        }
    }
}
