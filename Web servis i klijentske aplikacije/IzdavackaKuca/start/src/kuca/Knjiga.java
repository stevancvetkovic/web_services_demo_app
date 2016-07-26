package kuca;

public class Knjiga
{
        private String naslov;
	private String ISBN;
	private int brojStrana;
	private String opis;
	private double ocena;
        private IzdavackaKuca izdavac;
        private int brojKnjiga = 0;

	public void printKnjiga()
	{
                System.out.println("Naslov: " + this.naslov);
		System.out.println("ISBN: " + this.ISBN);
		System.out.println("Broj strana: " + this.brojStrana);
		System.out.println("Opis: " + this.opis);
		System.out.println("Ocena: " + this.ocena);
	}
    
    public void setNaslov(String nNaslov)
    {
        this.naslov = nNaslov;
    }

    public String getNaslov()
    {
        return this.naslov;
    }

    public void setISBN(String nISBN)
    {
        this.ISBN = nISBN;
    }

    public String getISBN()
    {
        return this.ISBN;
    }

    public void setBrojStrana(int nBrojStrana)
    {
        this.brojStrana = nBrojStrana;
    }

    public int getBrojStrana()
    {
        return this.brojStrana;
    }

    public void setOpis(String nOpis)
    {
        this.opis = nOpis;
    }

    public String getOpis()
    {
        return this.opis;
    }

    public void setOcena(double nOcena)
    {
        this.ocena = nOcena;
    }

    public double getOcena()
    {
        return this.ocena;
    }

    public void setBrojKnjiga(int nBrojKnjiga)
    {
        this.brojKnjiga = nBrojKnjiga;
    }

    public int getBrojKnjiga()
    {
        return this.brojKnjiga;
    }
}
