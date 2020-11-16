package pl.imjad.Wojciechowski;

class Student extends Osoba {
    public Student(String nazwisko, String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec, String kierunek, double srednia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.srednia = srednia;
    }

    public String getOpis() {
        return "kierunek studiów: " + kierunek;
    }

    public double getSrednia() {
        return srednia;
    }

    private String kierunek;
    private double srednia;
}
