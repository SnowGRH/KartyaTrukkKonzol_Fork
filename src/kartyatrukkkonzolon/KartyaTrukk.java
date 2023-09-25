package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukk {

    private final Scanner sc = new Scanner(System.in);

    private Pakli pakli;

    public static void main(String[] args) {
        new KartyaTrukk().indit();
    }

    public KartyaTrukk() {
        this.pakli = new Pakli();
    }

    private void indit() {
        for (int i = 0; i < 3; i++) {
            this.pakli.kirak();
            int oszlop = melyik();
            this.pakli.kever(oszlop);
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
