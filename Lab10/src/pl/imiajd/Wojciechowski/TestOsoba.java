package pl.imiajd.Wojciechowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestOsoba {

    public static void main(String[] args){
//        ArrayList<Osoba> grupa = new ArrayList<>(5);
//        grupa.add(new Osoba("Nowak", LocalDate.of(2000,12,12)));
//        grupa.add(new Osoba("Nowak", LocalDate.of(1994,11,2)));
//        grupa.add(new Osoba("Kowalski", LocalDate.of(1994,11,2)));
//        grupa.add(new Osoba("Ad", LocalDate.of(2001,1,2)));
//        grupa.add(new Osoba("Bar", LocalDate.of(1998,5,13)));
//
//        for (Osoba o:grupa) {
//            System.out.println(o);
//        }

//        ArrayList<Osoba> grupa = new ArrayList<>(5);
//        grupa.add(new Student("Nowak", LocalDate.of(2000,12,12),4.7));
//        grupa.add(new Student("Nowak", LocalDate.of(1999,12,12),4.72));
//        grupa.add(new Student("Kowalski", LocalDate.of(1994,11,2),2.0));
//        grupa.add(new Student("Ad", LocalDate.of(2001,1,2),5.0));
//        grupa.add(new Student("Bar", LocalDate.of(1998,5,13),3.2));
//
//     /*   for (Osoba o:grupa) {
//            System.out.println(o);
//        }*/
//        System.out.println(grupa.get(0));
//        System.out.println(grupa.get(1));
//        System.out.println(grupa.get(0).equals(grupa.get(1)));
//
//        System.out.println(grupa);
//        Collections.sort(grupa);
//        System.out.println(grupa);

        ArrayList<String> grupa = new ArrayList<>();
        try{
            File plik = new File("Tekstowy.txt");
            Scanner in = new Scanner(plik);
            while(in.hasNextLine()){
                grupa.add(in.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Nie ma pliku tekstowego");
        }
        System.out.println(grupa);

        Collections.sort(grupa);
        System.out.println(grupa);




        
    }
}
