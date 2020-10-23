package com.company;

public class Main {
    public static void main(String[] args) {

        RachunekBankowy saver1 = new RachunekBankowy(2000d);
        RachunekBankowy saver2 = new RachunekBankowy(3000d);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        saver1.wypiszSaldo();
        saver2.wypiszSaldo();
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        saver1.wypiszSaldo();
        saver2.wypiszSaldo();

/*Main od Adriana
        IntegerSet zbiorA= new IntegerSet();
        IntegerSet zbiorB= new IntegerSet();
        zbiorA.insertElement(20);
        zbiorA.insertElement(30);
        zbiorA.insertElement(40);
        zbiorB.insertElement(44);
        zbiorB.insertElement(30);
        zbiorB.insertElement(21);
        System.out.println(zbiorA);
        System.out.println(zbiorB);
        System.out.println(IntegerSet.union(zbiorA,zbiorB));
        System.out.println(IntegerSet.intersection(zbiorA,zbiorB));
        zbiorA.deleteElement(30);
        System.out.println(zbiorA);
        System.out.println(zbiorA.equals(zbiorB));
        IntegerSet zbiorC= new IntegerSet();
        zbiorC.insertElement(20);
        zbiorC.insertElement(40);
        System.out.println(zbiorA.equals(zbiorC));
    }*/
    }
}
