import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        PriorityQueue<opisy> kolejka = new PriorityQueue<>();
//        opisy jeden = new opisy(13,"jeden");
//        opisy dwa = new opisy(11,"dwa");
//        opisy trzy = new opisy(1,"trzy");
//        opisy cztery = new opisy(2,"cztery");
//        opisy cztery2 = new opisy(1.5,"cztery");
//        opisy piec = new opisy(3,"piec");
//        opisy szesc = new opisy(4,"szesc");
//        opisy szesc2 = new opisy(20,"szesc2");
//        opisy szesc3 = new opisy(30,"szesc3");
//        opisy szesc4 = new opisy(40,"szesc4");
//        kolejka.add(jeden);
//        kolejka.add(dwa);
//        kolejka.add(trzy);
//        kolejka.add(piec);
//        kolejka.add(szesc);
//        kolejka.add(szesc2);
//        kolejka.add(szesc3);
//        kolejka.add(cztery);
//        kolejka.add(cztery2);
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        while (!input.equals("zakończ")){
//            if(input.equals("następne")){
//                opisy.nastepne(kolejka);
//            }
//            else if(input.equals("dodaj priorytetowy opis")){
//                System.out.print("Podaj priorytet(int):");
//                String pri = scan.nextLine();
//                int i = Integer.parseInt(pri);
//                System.out.print("\nPodaj opis: ");
//                String opi = scan.nextLine();
//                opisy temp = new opisy(i,opi);
//                opisy.dodajPriorytetowyOpis(kolejka,temp);
//            }
//            else{
//                System.out.println("Zły input");
//                break;
//            }
//            input=scan.nextLine();
//        }
//        while(!kolejka.isEmpty()){
//            System.out.println(kolejka.remove());
//        }
//        return;
//    }
//        TreeMap<String, String> mapa = new TreeMap<String, String>();
//        kolej.dodaj(mapa,"Carl","db+");
//        kolej.dodaj(mapa,"Susan","bdb");
//        kolej.dodaj(mapa,"Joe","db");
//
//        kolej.wypisz(mapa);

        HaszMapa mapa = new HaszMapa();
        Student st1 = new Student("Adam","Nowak",156031);
        Student st2 = new Student("Ewa","Kowalska",221345);
        Student st3 = new Student("Joe","Smith",122022);
        Student st4 = new Student("James","Adobe",154022);
        Student st5 = new Student("Anne","Adobe",245052);
        Student st6 = new Student("Anne","Adobe",218802);
        mapa.dodaj(st1,"bdb");
        mapa.dodaj(st2,"bdb+");
        mapa.dodaj(st3,"db");
        mapa.dodaj(st4,"dst");
        mapa.dodaj(st5,"db+");
        mapa.dodaj(st6,"bdb");
        ArrayList<Student> lista = new ArrayList<Student>();
        lista.add(st1);
        lista.add(st2);
        lista.add(st3);
        lista.add(st4);
        lista.add(st5);
        lista.add(st6);
        Collections.sort(lista);
        System.out.println(lista);
        mapa.wypisz();

    }

}