package kartyatrukkkonzolon;

public class Pakli {

    private String leira;

    public Pakli() {
        this.feltolt(String[] szinek , String[] ertekek);

        ezVolt();

    }

    private void feltolt() {

        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }

    }

    private void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private void kever(int oszlop) {
        // mindig középre a választott
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;
    }

    private void ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
    }
}
