package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukk {

    private final Scanner sc = new Scanner(System.in);

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
