package TugasPBO;

import java.util.Scanner;

class cewekaya extends Manusia {

    Scanner baca = new Scanner(System.in);
    String jenis, type;

    @Override
     protected void typecewe() {
        System.out.print(" muka = ");
        jenis = baca.next();
        System.out.print(" rambut = ");
        jenis = baca.next();
    }  

    public void ciricewe() {
        System.out.print(" bentuk badan  = ");
        type=baca.next();
        System.out.print(" ukuran sepatu = ");
        type = baca.next();
    }
}
