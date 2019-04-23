
package TugasPBO;

import java.util.Scanner;
public class Manusia {
     Scanner baca = new Scanner(System.in);
    String nama, usia, alamat,type,sifat;
    public void identitas() {
        System.out.print("Nama                  =   ");
        nama = baca.next();
        System.out.print("Alamat                =   ");
        alamat = baca.next();
        System.out.print("Usia                  =   ");
        usia = baca.next();
        
    }

    protected void typecewe() {
        System.out.print(" muka = ");
        type = baca.next();
        System.out.print(" rambut = ");
        type = baca.next();
    }  
   
         protected void sifatcewe() {
        System.out.print(" sabar = ");
        sifat = baca.next();
        System.out.print(" matre = ");
        sifat = baca.next();
    }  
}