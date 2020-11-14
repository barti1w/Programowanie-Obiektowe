package pl.imiajd.Wojciechowski;

public class Student extends Osoba{
    private String kierunek;
    Student(String nazwisko,String rokUrodzenia, String kierunek){
        super(nazwisko,rokUrodzenia);
        this.kierunek=kierunek;
    }
    public String getKierunek() {
        return this.kierunek;
    }
    @Override
    public String toString() {
        return super.getNazwisko()+super.getRokUrodzenia()+this.kierunek;
    }
}
