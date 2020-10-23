import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Zad2 {
    public static int odczyt(String str, char c) throws FileNotFoundException {
        File plik = new File(str);
        Scanner odczyt = new Scanner(plik);
        int suma = 0;
        while (odczyt.hasNextLine()) {
            String text = odczyt.nextLine();
            suma += Zad1.countChar(text, c);
        }
        odczyt.close();
        return suma;
    }
    public static int odczyt(String str, String c) throws FileNotFoundException {
        File plik = new File(str);
        Scanner odczyt = new Scanner(plik);
        int suma = 0;
        while (odczyt.hasNextLine()) {
            String text = odczyt.nextLine();
            suma += Zad1.countSubStr(text, c);
        }
        odczyt.close();
        return suma;
    }
}


