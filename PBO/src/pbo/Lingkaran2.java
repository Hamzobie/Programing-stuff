package pbo;
import java.util.Scanner;

public class Lingkaran2 {
    public static void main(String args[]) {
        int i;
        double r;
        hitung obj =new hitung();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Jari-jari Lingkaran : ");
        r = sc.nextInt();
        obj.setR(r);
        System.out.println("Menghitung\n1.Keliling\n2.luas\nMasukan : ");
        i = sc.nextInt();
        switch(i){
            case 1-> obj.keliling();
            case 2-> obj.luas();
        }
    }
}
