import java.awt.*;
import javax.swing.*;

/**
 * Created by Bogdan on 19-09-2017.
 */
public class GUIKalk extends JFrame {
    String nazwaApp;

    public GUIKalk() {
        super("Kalkulator");
        this.nazwaApp = new String("Kalkulator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
    }
    public GUIKalk(String nazwaApp) {
        super(nazwaApp);
        this.nazwaApp = nazwaApp;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setDefaultLookAndFeelDecorated(true);
        this.setSize(300,500);
        pack();
    }
}
