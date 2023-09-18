package kartyatrukkkonzolon;

import java.util.Scanner;

public class Lap {

    private String[] pakli = new String[22];
    private String leiras;
    String[] szinek = {"P", "T", "Z", "M"};
    String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

    public Lap(String leiras) {
        this.leiras = leiras;
    }

    public String getLeiras() {
        return leiras;
    }

}
