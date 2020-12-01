package pl.imiajd.Wojciechowski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;


    public Student(String naz, LocalDate dat, double sredniaOcen) {
        super(naz, dat);
        this.sredniaOcen=sredniaOcen;
    }




    @Override
    public String toString(){
        return super.toString() +" "+ this.sredniaOcen;
    }

    @Override
    public int compareTo(Osoba o) {
        int result = super.compareTo(o);
        if (result==0){
           if(Math.abs(this.sredniaOcen - (((Student) o).sredniaOcen))<=0.00000000001){
               result = 0;
           }else{
               result = 1;
            }
        }
        return result;
    }
}
