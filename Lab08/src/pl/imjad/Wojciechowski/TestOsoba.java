package pl.imjad.Wojciechowski;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba
{
    public static void main(String[] args)
    {
        /*Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Olaf","Jan"}, LocalDate.now(),true,5000,LocalDate.of(2000,1,1));
        ludzie[1] = new Student("Kowalska", new String[]{"Malgorzata"}, LocalDate.of(2010,5,4),false,"Informatyka",4.5);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            for (String im : p.getImiona()){
                System.out.print(im);
            }
            if(p.getPlec()==false){
                System.out.print(" Kobieta ");
            }
            else System.out.print(" Mężczyzna ");
            System.out.println(p.getNazwisko() + ": " + p.getOpis() + p.getDataUrodzenia());

        }*/
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Fortepian("Forte", LocalDate.of(2000,1,20)));
        orkiestra.add(new Skrzypce("Skrz", LocalDate.of(1690,12,30)));
        orkiestra.add(new Skrzypce("Skrza", LocalDate.of(2001,8,27)));
        orkiestra.add(new Flet("Flecista", LocalDate.of(1000,8,12)));
        orkiestra.add(new Fortepian("BamBam", LocalDate.of(2019,6,4)));
        for(Instrument i: orkiestra){
            System.out.print(i.dzwiek()+" ");
            System.out.println(i);

        }

        }

}


