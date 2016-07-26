package kuca;

import org.w3c.dom.*;

/*import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.io.IOException;*/

public class Dom
{
    public Document document;

    	public void brisiK(String ISBN) throws NePostojiException
	{
            NodeList lista = this.document.getElementsByTagName("izd:ISBN");
            boolean flag = false;

            for(int i=0; i<lista.getLength(); i++)
                if (lista.item(i).getTextContent().equals(ISBN))
                    flag = true;

            if (flag==true)
            {
                for(int i=0; i<lista.getLength(); i++)
                {
                    if (lista.item(i).getLastChild().getNodeValue().equals(ISBN))
                    {
                        Element element = (Element) document.getElementsByTagName("izd:Knjiga").item(i);
                        element.getParentNode().removeChild(element);
                        i--;
                    }
                }
            }
            else
                throw new NePostojiException("Ne postoji knjiga sa zadatim ISBN brojem!");
    }

    public void promeniK(String ISBN, int brojStrana, String opis, double ocena) throws NePostojiException
    {
         NodeList lista = this.document.getElementsByTagName("izd:ISBN");
         boolean flag = false;

         for(int i=0; i<lista.getLength(); i++)
            if (lista.item(i).getTextContent().equals(ISBN))
                flag = true;

         if (flag==true)
         {
             for(int i=0; i<lista.getLength(); i++)
             {
                 Element element = (Element) document.getElementsByTagName("izd:Opis").item(i);
                 element.setTextContent(opis);

                 Element element2 = (Element) document.getElementsByTagName("izd:Ocena").item(i);
                 element2.setTextContent(Double.toString(ocena));

                 Element element3 = (Element) document.getElementsByTagName("izd:BrojStrana").item(i);
                 element3.setTextContent(Integer.toString(brojStrana));
             }
         }
         else
         {
            throw new NePostojiException("Ne postoji knjiga sa zadatim ISBN brojem!");
         }
    }

    /*public static void main(String[] args)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Dom sm = new Dom();
            sm.document = builder.parse( new File("knjige.rdf") );

            //sm.brisiKnjigu("977678892");
            //sm.promeniKnjigu("977678892", 2, "Test!", 9.0);

            TransformerFactory xformFactory = TransformerFactory.newInstance();
            Transformer idTransform = xformFactory.newTransformer();
            Source input = new DOMSource(sm.document);
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
    }*/
}