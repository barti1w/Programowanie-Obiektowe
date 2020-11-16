package pl.imjad.Wojciechowski;

import java.time.LocalDate;

class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate data){
        super(producent,data);
    }
    public String dzwiek(){
        return "plum";
    }
}
