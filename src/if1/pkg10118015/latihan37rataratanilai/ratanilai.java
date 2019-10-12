/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan37rataratanilai;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ratanilai {
    public double jmlnilai = 0;
    
    public void inputnilai(int jmlmhs){
        double nilai;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= jmlmhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scanner.nextDouble();
            jmlnilai = jmlnilai + nilai;
        }
    }
    
    public double hitungRatarata(double jmlnilai, int jmlmhs){
        return jmlnilai /= jmlmhs;
    }
    
}
