package pl.imjad.Wojciechowski;

import java.time.LocalDate;

class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate data){
        super(producent,data);
    }
    public String dzwiek(){
        return "skrzyp";
    }
}
