package pl;
import java.util.Scanner;

public class Modul5Tugas1 {
    public static int CariIndex(int arr[], int n){
        int i = 0;
        while(i < arr.length){
            if(arr[i] == n){
                return i;
            }else{
                i++;
            }
        }
        return 0;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array={-80,-50,0,40,0,-30,90,70,89,50,-55};
        System.out.print("==MENCARI INDEKS ARRAY YANG TERURUT==\nArray : ["+array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.print("]\n");
        System.out.println("Masukan Elemen Array yang dicari : ");
        int input = sc.nextInt();
        System.out.print("Array Dirutkan : \n[");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1 ; j < array.length; j++){
                int buffer;
                if (array[i]>array[j]){
                    buffer = array[i];
                    array[i]=array[j];
                    array[j]=buffer;
                }
            }
            System.out.print(" "+array[i]);
        }      
        System.out.print(" ]\n");
        System.out.println("Index dari "+input+" adalah : "+CariIndex(array, input));
    }
}
