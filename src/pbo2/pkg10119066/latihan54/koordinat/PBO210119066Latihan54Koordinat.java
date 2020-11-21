/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan54.koordinat;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " + wk.getY());
    }
    
}
