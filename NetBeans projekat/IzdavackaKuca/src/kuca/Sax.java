package kuca;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler
{
    StringBuffer textBuffer = null;
    
    public Knjiga trenutnaKnjiga = null;
    public Knjiga[] nizKnjiga = new Knjiga[10];
    public int brojKnjiga = 0;
    public Knjiga filterKnjiga = new Knjiga();

    @Override
    public void startDocument() throws SAXException
    {
        try
	{
            //System.out.println("Pocinje obrada!");
	}
	catch (Exception e)
	{
            throw new SAXException("U/I greska!", e);
	}
    }

    @Override
    public void endDocument() throws SAXException
    {
        try
        {
            //System.out.println("Obrada je zavrsena!");
        }
        catch (Exception e)
        {
            throw new SAXException("U/I greska!", e);
	}
    }

    @Override
    public void startElement(String namespaceURI,
                String sName,
		String qName,
		Attributes attrs) throws SAXException
    {

        if (qName.equals("izd:Knjiga"))
	{
                this.trenutnaKnjiga = new Knjiga();
                this.trenutnaKnjiga.setNaslov(attrs.getValue("rdf:about"));
	}
    }

    @Override
    @SuppressWarnings("static-access")
    public void endElement(String namespaceURI,
		String sName,
		String qName
		)throws SAXException
    {
	if(qName.equals("izd:Knjiga"))
        {
            if (this.trenutnaKnjiga.getISBN().startsWith(this.filterKnjiga.getISBN()))
            {
                this.nizKnjiga[this.brojKnjiga] = new Knjiga();
                this.nizKnjiga[this.brojKnjiga++] = this.trenutnaKnjiga;
            }
	}

        if (textBuffer != null)
	{
            String contentValue = textBuffer.toString().trim();
            if (qName.equals("izd:ISBN"))
                this.trenutnaKnjiga.setISBN(contentValue);
            else if (qName.equals("izd:BrojStrana"))
                this.trenutnaKnjiga.setBrojStrana(Integer.parseInt(contentValue));
            else if (qName.equals("izd:Opis"))
                this.trenutnaKnjiga.setOpis(contentValue);
            else if (qName.equals("izd:Ocena"))
                this.trenutnaKnjiga.setOcena(Double.parseDouble(contentValue));

            textBuffer = null;
        }
    }

    @Override
    public void characters(char buf[], int offset, int len) throws SAXException
    {
        String s = new String(buf, offset, len);
	if (textBuffer == null)
	{
            textBuffer = new StringBuffer(s);
	}
	else
	{
            textBuffer.append(s.trim());
        }
    }
}
