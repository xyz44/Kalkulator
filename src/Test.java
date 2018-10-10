/**
 * Created by Bogdan on 18-09-2017.
 */
//import java.io.*;
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main (String args[]) {
        Obliczenia oblicz = new Obliczenia();
        GUIKalk oknoApp;

        oknoApp = new GUIKalk();
        //oknoApp = new GUIKalk("Kalkulator");


        EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        oknoApp.setVisible(true);
                    }
                });

        /*
        System.out.println(oblicz.Mnozenie(2,3));
        System.out.println(oblicz.Mnozenie(2.0,3.0));
        System.out.println(oblicz.Dzielenie(3,2));
        System.out.println(oblicz.Dzielenie(3.4,2.5));
        System.out.println(oblicz.Mnozenie(new BigDecimal("28384858848387216385.7"),new BigDecimal("9492049567323456778.0")));
        System.out.println("Dzielenie liczb BigInteger : " + oblicz.Dzielenie( new BigInteger("28344444848588483872163857"),
                new BigInteger("9492049567323456778")));
        System.out.println("Dzielenie liczb BigDecimal : " + oblicz.Dzielenie( new BigDecimal("2834444484858848387216385.7"),
                new BigDecimal("9492049567323.4567780")));
        */
    }
}
