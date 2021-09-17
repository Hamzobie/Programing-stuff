package pbo;
import java.util.Scanner;
public class Lingkaran1 {
    public static void main(String args[]) {
        int i, s;
        double luas, kel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan panjang jari-jari :");
        i = sc.nextInt();
        luas = 3.14*i*i;
        kel = 3.14*2*i;
        System.out.println("\nPilih Penghitungan :\n1.Luas\n2.Keliling\nMasukan:");
        s = sc.nextInt();
        switch(s){
            case 1 -> System.out.println("Luasnya adalah : "+luas);
            case 2 -> System.out.println("Kelilingnya adalah : "+kel);
        }
    }
}

