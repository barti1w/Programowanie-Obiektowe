package pl.imiajd.Wojciechowski;

public class TestNazwanyPunkt {
    public static void main(String[] args) {

    Adres jeden = new Adres("Kanta","10","20","10-690");
    Adres dwa = new Adres("Kanta","10","20","10-691");
    jeden.pokaz();
    dwa.pokaz();
    System.out.println(dwa.przed("10-690"));

    Osoba Andzej= new Osoba("Paździoch","1999");
    Student Marian = new Student("Olgierski","1990","kosmetologia");
    Nauczyciel Adam = new Nauczyciel("Kur","1973","2300");
    System.out.println(Andzej);
    System.out.println(Marian);
    System.out.println(Adam);
    System.out.println(Marian.getKierunek());
    System.out.println(Marian.getNazwisko());
    System.out.println(Marian.getRokUrodzenia());
    System.out.println(Adam.getPensja());

    BetterRectangle prostokat= new BetterRectangle();
    System.out.println(prostokat.getArea());
    System.out.println(prostokat.getPerimeter());














      /*
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?) przypisanie innej klasy obiektowi
        //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)klasa NazwanyPunkt wymaga 3 składowych w inicjalizatorze

        //a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?) przypisanie innej klasy obiektowi
        a = (NazwanyPunkt) c;
        a.show();*/
    }
}
