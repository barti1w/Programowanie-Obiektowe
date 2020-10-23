public class Zad1 {
    public static int countChar(String str, char c){
        int suma=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                suma++;
            }
        }
        return suma;
    }
    public static int countSubStr(String str, String subStr){
        int suma=0;
        for (int i=0;i<str.length()-subStr.length()+1;i++) {
            if(subStr.equals(str.substring(i,i+subStr.length()))){
                suma++;
            }
        }
        return suma;
    }
    public static String middle(String str){
        if (str.length()%2==0){
            return str.substring(str.length()/2-1,str.length()/2+1);
        }
        else{
            return str.substring(str.length()/2,str.length()/2+1);
        }
    }
    public static String repeat(String str, int n){
        if (n==1){
            return str;
        }
        else
            return str+repeat(str,n-1);
    }
    public static int[] where(String str, String subStr){
        int nowy [] = new int[str.length()];
        int a=0;
        for (int i=0;i<str.length()-subStr.length()+1;i++) {
            if(subStr.equals(str.substring(i,i+subStr.length()))){
                for (int j=i;j<i+subStr.length();j++){
                    nowy[a]=j;
                    a++;
                }
            }
        }
        int nowe [] = new int[a];
        for (int i=0;i<a;i++){
            nowe[i]=nowy[i];
        }
        return nowe;
    }
    public static String change(String str){
        StringBuffer sbf1 = new StringBuffer("");
        for (int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                sbf1.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sbf1.append(Character.toLowerCase(str.charAt(i)));
            }
        }
    return sbf1.toString();
    }
    public static String nice (String str){
        StringBuffer sbf1 = new StringBuffer("");
        int juz=0;

        for (int i=0;i<str.length();i++){
            sbf1.append(str.charAt(i));
            juz++;
            if(juz%3==str.length()%3&&i!=str.length()-1){
                sbf1.append("'");
            }
        }
        return sbf1.toString();
    }
    public static String nice (String str, char c, int n){
        StringBuffer sbf1 = new StringBuffer();
        int juz=0;
        for (int i=0;i<str.length();i++){
            sbf1.append(str.charAt(i));
            juz++;
            if(juz%n==str.length()%n&&i!=str.length()-1){
                sbf1.append(c);
            }
        }
        return sbf1.toString();
    }
}
