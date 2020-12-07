import java.util.TreeMap;

public class kolej{

    public static void dodaj(TreeMap<String, String> mapa, String nazwisko, String ocena){
        mapa.put(nazwisko,ocena);
    }
    public static void usuń(TreeMap<String, String> mapa, String nazwisko){
        mapa.remove(nazwisko);
    }
    public static void zmień(TreeMap<String, String> mapa, String nazwisko, String ocena){
        mapa.replace(nazwisko,ocena);
    }
    public static void wypisz(TreeMap<String, String> mapa){
        System.out.println(mapa);
    }

}
