package kuca;

public class IzdavackaKuca
{
        private String nazivKuce;
	private String lokacija;
	private String telefon;

	public void printIzdavackaKuca()
	{
                System.out.println("Izdavac: " + this.nazivKuce);
		System.out.println("Lokacija: " + this.lokacija);
		System.out.println("Telefon: " + this.telefon);
	}

    public void setNazivKuce(String nNazivKuce)
    {
        this.nazivKuce = nNazivKuce;
    }

    public String getNazivKuce()
    {
        return this.nazivKuce;
    }

    public void setLokacija(String nLokacija)
    {
        this.lokacija = nLokacija;
    }

    public String getLokacija()
    {
        return this.lokacija;
    }

    public void setTelefon(String nTelefon)
    {
        this.telefon = nTelefon;
    }

    public String getTelefon()
    {
        return this.telefon;
    }
}