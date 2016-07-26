package kuca;

public interface Metode
{
    public Knjiga[] vratiKnjige(String filterISBN);
    public void promeniKnjigu(String ISBN, int brojStrana, String opis, double ocena) throws NePostojiException;
    public void brisiKnjigu(String ISBN) throws NePostojiException;
}