/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan44.hukumohm;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat program menghitung kuat arus, hambatan, hasil tegangan
 */
public class PBO210118046Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai ohm = new Baterai();
        Baterai baterai = new Baterai((float) 3.0, (float) 12.0);
        System.out.println("Kuat Arus : " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan: " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan: " + baterai.hitungTegangan() + " volt");
    }
    
}
