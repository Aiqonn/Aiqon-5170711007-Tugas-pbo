package TugasPBO;

import java.util.Scanner;

class ceweidaman extends Manusia {

    Scanner baca = new Scanner(System.in);
    String sifat, kemauan;
    
    @Override
     protected void sifatcewe() {
        System.out.print(" sabar = ");
        sifat = baca.next();
        System.out.print(" matre = ");
        sifat = baca.next();
    }  

    protected void kemauancewe() {
        System.out.print(" ber-mobil =");
        kemauan = baca.next();
        System.out.print(" ber-motor =");
        kemauan = baca.next();
    }
}
