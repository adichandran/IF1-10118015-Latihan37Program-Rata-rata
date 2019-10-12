/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan37rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program Perhitungan rata-rata nilai mhs
 */
public class IF110118015Latihan37rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ratanilai input = new ratanilai();
        Scanner inputmhs = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jmlmhs = inputmhs.nextInt();
        input.inputnilai(jmlmhs);
        System.out.println();
        double jmlnilai;
	System.out.println("Maka, Rata-rata Nilainya adalah " + input.hitungRatarata(input.jmlnilai, jmlmhs));
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
    
}
