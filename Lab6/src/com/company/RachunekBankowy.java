package com.company;

public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double a){
        this.saldo=a;
    }
    public void obliczMiesieczneOdsetki(){
         this.saldo=this.saldo+this.saldo*rocznaStopaProcentowa/12;
    }
    public static void setRocznaStopaProcentowa(double a){
        rocznaStopaProcentowa=a;
    }
    public void wypiszSaldo(){
        System.out.println(saldo);
    }

}
