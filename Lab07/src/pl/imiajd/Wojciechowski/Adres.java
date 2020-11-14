package pl.imiajd.Wojciechowski;

public class Adres {
    Adres(String ulica,String numer_domu,String miasto,String kod_pocztowy,String numer_mieszkania){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
        this.numer_mieszkania=numer_mieszkania;
    }
    Adres(String ulica,String numer_domu,String miasto,String kod_pocztowy){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public void pokaz(){
        System.out.println(this.kod_pocztowy +" "+this.miasto);
        if(this.numer_mieszkania==null){
            System.out.println(this.numer_domu+" "+this.ulica);
        }else{
            System.out.println(this.numer_domu+" "+this.numer_mieszkania+" "+this.ulica);
        }
    }
    public boolean przed(String name){
        return  name==this.kod_pocztowy;
    }

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

}
