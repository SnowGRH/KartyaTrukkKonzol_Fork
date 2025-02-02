package modell;

public class Pakli {

    private Lap[] pakli = new Lap[22];
    private Lap[] ujPakli = new Lap[22];

    public Pakli() {
        this.feltolt();

    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < this.pakli.length; e++) {
                this.pakli[i++] = new Lap(szin + "_" + ertekek[e]);
            }
        }

    }

    public Lap[] getPakli() {
        return pakli;
    }

    public void setOszlo(int oszlop) {
        kever(oszlop);
    }

    private void kever(int oszlop) {
        // mindig középre a választott

        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = this.pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = this.pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = this.pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = this.pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = this.pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = this.pakli[20 - (i - 1) * 3];
                }
                break;
        }
        
    }

    public Lap[] getUjPakli() {
        return ujPakli;
    }

    public Lap ezVolt() {
        //System.out.println("A választott lap: " + this.pakli[11].getLeiras());
        return ujPakli[11];
    }


}
