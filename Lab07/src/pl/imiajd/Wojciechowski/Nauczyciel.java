package pl.imiajd.Wojciechowski;

public class Nauczyciel extends Osoba{
    private String pensja;
    Nauczyciel(String nazwisko,String rokUrodzenia, String pensja){
        super(nazwisko,rokUrodzenia);
        this.pensja=pensja;
    }
    public String getPensja() {
        return this.pensja;
    }
    @Override
    public String toString() {
        return "pensja: "+this.pensja+super.toString();
    }
}
