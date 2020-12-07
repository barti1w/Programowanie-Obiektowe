import java.util.TreeMap;

public class HaszMapa {
    private TreeMap<Student,String> mapa;
    private TreeMap<Integer,Student> identy;


    public HaszMapa(){
        this.mapa=new TreeMap<Student,String>();
        this.identy=new TreeMap<Integer, Student>();
    }

    public void dodaj(Student student, String ocena){
        this.identy.put(student.getId(),student);
        this.mapa.put(student,ocena);
    }
    public void usun(Integer id){
        this.mapa.remove(this.identy.get(id));
    }
    public void zmien(Integer id,String ocena){
        this.mapa.replace(this.identy.get(id),ocena);
    }
    public void wypisz(){
        System.out.println(this.mapa);
    }

}
