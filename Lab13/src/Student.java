
public class Student implements Comparable <Student>{
    private String imie;
    private String nazwisko;
    private int id;

    public Student(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        return this.nazwisko+this.imie+this.id;
    }

    @Override
    public int compareTo(Student o) {
        if(o.getNazwisko().compareTo(this.nazwisko)!=0){
            return o.getNazwisko().compareTo(this.nazwisko)*-1;
        }
        if(o.getImie().compareTo(this.imie)!=0){
            return o.getImie().compareTo(this.imie)*-1;
        }
        if(o.getId()<this.id){
            return 1;
        }else if(o.getId()>this.id){
            return -1;
        }
        return 0;
    }

}
