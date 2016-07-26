package kuca;

import org.w3c.dom.*;

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
}