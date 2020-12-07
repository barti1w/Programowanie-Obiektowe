import java.util.Objects;
import java.util.PriorityQueue;


public class opisy implements Comparable<opisy>{
    private double kolej;
    private String opis;

    public opisy(double kolej, String opis){
        this.kolej=kolej;
        this.opis=opis;
    }

    public void setKolej(double kolej){
        this.kolej=kolej;
    }
    public void setOpis(String opis){
        this.opis=opis;
    }

    public double getKolej(){
        return this.kolej;
    }

    public String getOpis(){
        return this.opis;
    }

    public static  void nastepne(PriorityQueue<opisy> kolejka) {
        kolejka.remove(kolejka.peek());
    }
    public static void dodajPriorytetowyOpis(PriorityQueue<opisy> kolejka,opisy temp){
        kolejka.add(temp);
    }

    @Override
    public String toString(){
        return "Task: "+opis+" of importance: "+kolej;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        opisy opis1 = (opisy) o;
        return Objects.equals(opis,opis1.opis)&&
                Double.compare(kolej,opis1.kolej)==0;

    }

    @Override
    public int hashCode(){
        return Objects.hash(kolej,opis);
    }

    @Override
    public int compareTo(opisy o) {
        int result = 0;
        if(Double.compare(this.getKolej(),o.getKolej())>0)
            result = -1;
        if(Double.compare(this.getKolej(),o.getKolej())<0)
            result = 1;
        return result;
    }
}