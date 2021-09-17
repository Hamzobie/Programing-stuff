package pl;
import java.util.Scanner;
import java.util.Arrays;

public class Modul5Tugas2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array={-80,-50,0,40,0,-30,90,70,89,50,-55};
        System.out.println("==MENCARI INDEKS ARRAY YANG TERURUT==");
        System.out.println("Array : "+Arrays.toString(array));
        System.out.println("Masukan Nilai Array yang dicari : ");
        int input= sc.nextInt();
        Arrays.sort(array);
        System.out.println("Array yang Diurutkan : "+Arrays.toString(array));
        System.out.println("Index dari "+input+" adalah : "+Arrays.binarySearch(array, input));
    }
}
