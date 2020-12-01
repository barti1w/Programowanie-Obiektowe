package pl.imiajd.Wojciechowski;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba (String naz, LocalDate dat){
        this.nazwisko=naz;
        this.dataUrodzenia=dat;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }
    public LocalDate getDataUrodzenia(){
        return this.dataUrodzenia;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"["+this.nazwisko+" "+this.dataUrodzenia+"]";
    }

    public boolean equals(Osoba o){
        return o.dataUrodzenia.equals(this.dataUrodzenia) && o.nazwisko.equals(this.nazwisko);
    }





    @Override
    public int compareTo(Osoba o) {
        int result = this.nazwisko.compareTo(o.nazwisko);
        if (result==0){
            result = this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return result;
    }
}
