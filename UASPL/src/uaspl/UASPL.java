/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspl;

import java.util.Scanner;

/**
 *
 * @author Hamdani Zulva
 * @since 6-July-2021
 * @see #Faktorial(int) 
 * 
 */
public class UASPL {
    /**
     * Merupakan method untuk menghitung faktorial
     * @param a merupakan inputan dari user yang akan difaktorial
     * @return y hasil akhir dari faktorial
     */
    public static int Faktorial(int a){
        int y = 1;
        for(int i=a;i>0;i--){
            y*=i;
        }
        System.out.println(y);
        return y;
    }
    /**
     * method main digunakan untuk tampilan systemlog
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka yang Difaktorialkan : ");
        int f = sc.nextInt();
        if(f>0){
            System.out.print("Hasilnya adalah : ");
            Faktorial(f);
        }else{
            System.out.println("Masukan anda tidak bisa di terima");
            main(null);
        }
        
    }
}
