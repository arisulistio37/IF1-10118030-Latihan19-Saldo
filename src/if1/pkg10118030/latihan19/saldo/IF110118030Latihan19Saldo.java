/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan19.saldo;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang menghitung saldo tabungan
 *                      dengan bunga 15%
 */
public class IF110118030Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo = 2500000;
        double bunga = 0.15;
        double saldo1 = saldo + (bunga*saldo);
        int bulan = 6;
        
        for (int i=1; i<=bulan; i++, saldo1+=(saldo1*bunga)){
            System.out.println("Saldo bulan ke " +saldo1);
        }
    }
    
}
