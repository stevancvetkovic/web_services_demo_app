/**
 * MetodeSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kuca;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import org.xml.sax.*;

public class MetodeSoapBindingImpl implements kuca.Metode{
    public kuca.Knjiga[] vratiKnjige(java.lang.String in0) throws java.rmi.RemoteException {
        Knjiga[] lista = new Knjiga[0];
        Sax handler = new Sax();
        handler.filterKnjiga.setISBN(in0);
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

    public void promeniKnjigu(java.lang.String in0, int in1, java.lang.String in2, double in3) throws java.rmi.RemoteException, kuca.NePostojiException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Dom dm = new Dom();
            dm.document = builder.parse(new File("knjige.rdf"));

            dm.promeniK(in0, in1, in2, in3);

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

    public void brisiKnjigu(java.lang.String in0) throws java.rmi.RemoteException, kuca.NePostojiException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Dom dm = new Dom();
            dm.document = builder.parse(new File("knjige.rdf"));

            dm.brisiK(in0);

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
