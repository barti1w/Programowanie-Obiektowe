package pl.imjad.Wojciechowski;

import java.time.LocalDate;

abstract class Instrument {
    public Instrument(String producent, LocalDate data){
        this.producent=producent;
        this.rokProdukcji=data;
    }
    private String producent;
    private java.time.LocalDate rokProdukcji;
    public abstract String dzwiek();

    public String getProducent(){
        return producent;
    }
    public java.time.LocalDate getRokProdukcji(){
        return rokProdukcji;}

    public String toString(){
        return producent + " " +rokProdukcji;
    }
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

}
