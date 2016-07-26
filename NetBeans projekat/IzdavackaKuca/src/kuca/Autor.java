package kuca;

public class Autor
{
	private String ime;
	private String prezime;
        private Knjiga[] lista;

	public void printAutor()
	{
		System.out.println("Ime: " + this.ime);
		System.out.println("Prezime: " + this.prezime);
                System.out.println("Knjige:");
                for(int i=0; i<lista.length; i++)
                {
                    System.out.println(lista[i]);
                }
	}

	public void setIme(String nIme)
    {
        this.ime = nIme;
    }

    public String getIme()
    {
        return this.ime;
    }

    public void setPrezime(String nPrezime)
    {
        this.prezime = nPrezime;
    }

    public String getPrezime()
    {
        return this.prezime;
    }
}
