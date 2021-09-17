package pbo;
import java.util.Scanner;
class pulsa{
    public void isi(String isi){
        String isiPulsa="5000,10000,15000,20000,50000";
        if(isiPulsa.contains(isi)){
            System.out.println("Selamat Transaksi Berhasil");
        }else{
            System.out.println("Pulsa Tidak Ada");
        }
    }
    public void login(){
        pulsa obj= new pulsa();
        Scanner sc = new Scanner(System.in);
        String  noHp, spec= "08";
        System.out.println("Masukan nomor Hp anda : ");
        noHp = sc.nextLine();
        if((noHp.matches("[0-9]+"))&&(noHp.length()==12)){
            if(noHp.contains(spec)){
                obj.inputPulsa();
            }else{
                System.out.println("Nomor yang anda masukan tidak sesuai");
            }   
        }else{
            System.out.println("Nomor yang anda masukan salah/tidak sesuai\n\n");
            obj.login();
        }
    }
    public void inputPulsa(){
        pulsa obj= new pulsa();
        String isi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Pulsa :");
        isi=sc.nextLine();
        obj.isi(isi);
    }
    public void daftar(){
        System.out.println("\nDaftar Pulsa : ");
        System.out.println("1. 5000\n2. 10000\n3. 15000\n4. 20000\n5. 50000");
    }
}
public class latihan {
    public static void main(String[] args) {
        pulsa obj= new pulsa();
        obj.login();
    }
}
