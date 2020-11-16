package pl.imjad.Wojciechowski;
import java.time.LocalDate;

class Flet extends Instrument{
    public Flet(String producent, LocalDate data){
        super(producent,data);
    }
    public String dzwiek(){
        return "fiu";
    }


}
