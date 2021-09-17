package pl;

import java.util.Arrays;

public class Modul5Tugas3 {
    public static void rasio(int[] arr){
        float positif=0, nol=0, negatif=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                positif++;
            }else if (arr[i]<0){
                negatif++;
            }else if (arr[i]==0){
                nol++;
            }
        }
        System.out.println("Positif : "+(positif/arr.length));
        System.out.println("Negatif : "+(negatif/arr.length));
        System.out.println("Zero    : "+(nol/arr.length));
    }
    public static void main(String args[]) {
        int[] array={-80,-50,0,40,0,-30,90,70,89,50,-55};
        System.out.println(Arrays.toString(array));
        System.out.println("\nResult : ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        rasio(array);
    }
}
