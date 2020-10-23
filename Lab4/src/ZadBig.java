import java.math.BigInteger;
import java.math.BigDecimal;
public class ZadBig {
    public static String Zad4(int n){
        BigInteger a=new BigInteger("2");
        BigInteger b=new BigInteger(a.pow(n*n).toString());
        BigInteger c=new BigInteger("1");
        return b.subtract(c).toString();
    }
    public static String Zad5(float p, float k, int n){
        BigDecimal pro = new BigDecimal(String.valueOf(p));
        BigDecimal kap = new BigDecimal(String.valueOf(k));
        return kap.multiply(BigDecimal.ONE.add(pro.divide(BigDecimal.ONE)).pow(n)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
    }
}
