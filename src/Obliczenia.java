import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Created by Bogdan on 18-09-2017.
 */
public class Obliczenia {
    public Obliczenia() {

    };
    public int Mnozenie(int czynnik1, int czynnik2) {return czynnik1*czynnik2;};
    public double Mnozenie(double czynnik1, double czynnik2) {return czynnik1 * czynnik2;};
    public BigInteger Mnozenie(BigInteger czynnik1, BigInteger czynnik2) {return czynnik1.multiply(czynnik2);};
    public BigDecimal Mnozenie(BigDecimal czynnik1, BigDecimal czynnik2) {return czynnik1.multiply(czynnik2);};

    public double Dzielenie(int dzielna, int dzielnik) {return (double) dzielna / (double) dzielnik;};
    public double Dzielenie(double dzielna, double dzielnik) {return dzielna / dzielnik;};
    public BigDecimal Dzielenie(BigInteger dzielna, BigInteger dzielnik) {return new BigDecimal(dzielna.divide(dzielnik));};
    public BigDecimal Dzielenie(BigDecimal dzielna, BigDecimal dzielnik) {return dzielna.divide(dzielnik, 2, RoundingMode.UP);};
}
