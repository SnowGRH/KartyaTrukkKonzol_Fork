package nezet;

import java.util.Scanner;
import modell.Lap;
import modell.Pakli;

public class KartyaTrukk {

    private final Scanner sc = new Scanner(System.in);
    private Pakli pak = new Pakli();

    public static void main(String[] args) {
        new KartyaTrukk().indit();
    }

    public void indit() {
        kirak(pak.getPakli());
        for (int i = 0; i < 3; i++) {
            int oszlop = melyik();
            pak.setOszlo(oszlop);
            kirak(pak.getUjPakli());
        }

        System.out.println("A választott lap: "+pak.ezVolt().getLeiras());
    }

    private void kirak(Lap[] paklik) {
        Lap[] pakli = paklik;
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i].getLeiras());
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

}
