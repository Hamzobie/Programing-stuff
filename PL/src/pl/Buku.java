package pl;
import java.util.Scanner;

class Waktu{
    private int buku;

    public int getBuku() {
        return buku;
    }
    public void setBuku(int buku) {
        this.buku = buku;
    }
    public void Output(){
        System.out.println("Proses BERHASIL! \nDurasi peminjaman Anda :"+getBuku()+" Minggu");
    }
}
public class Buku {
    public static void main(String args[]) {
       Waktu obj = new Waktu();
       int jumlah;
       Scanner sc = new Scanner(System.in);
       System.out.println("Selamat Datang Di Perpustakaan"); 
       System.out.println("Masukan Jumlah Buku yang Anda Pinjam");
       System.out.println("Masukan : ");
       jumlah = sc.nextInt();
       if(jumlah>0 && jumlah<4){
            obj.setBuku(1);
            obj.Output();
       }else if(jumlah>=4 && jumlah<7){
            obj.setBuku(2);
            obj.Output();
       }else if(jumlah>=7 && jumlah<10){
            obj.setBuku(3);
            obj.Output();
       }else if(jumlah>=10 && jumlah<=13){
            obj.setBuku(4);
            obj.Output();
       }else if(jumlah<=0){
           System.out.println("Masukan Anda salah!!");
       }else if(jumlah>13){
           System.out.println("Masukan Anda melebihi batas!!");
       } 
    }
}
