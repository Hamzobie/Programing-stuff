package pbo;
import java.util.Scanner;
interface Pesanan{
    public void panas();
    public void dingin();
    public void harga();
}
class PesanMinum{
    private String jenis;
    private boolean panas;
    private int pilih;
    private String[] minuman={"Kopi","Teh","Susu","STMJ","Thai tea"};
    public PesanMinum(){
        panas = true;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public boolean isPanas() {
        return panas;
    }
    public void setPanas(boolean panas) {
        this.panas = panas;
    }
    public int getPilih() {
        return pilih;
    }
    public void setPilih(int pilih) {
        this.pilih = pilih;
    }
    public String[] getMinuman() {
        return minuman;
    }
    public void setMinuman(String[] minuman) {
        this.minuman = minuman;
    }
    
    public void ListMinum(){
        System.out.println("Daftar Minuman :");
        for(int i=0;i<getMinuman().length;i++){
            System.out.println(i+1+". "+getMinuman()[i]); 
        }
    }
    public void verifikasi(){
        int k=0;
        for(String i : getMinuman()){
            if(getJenis().equalsIgnoreCase(i)){
                k=1;
                break;
            }
        }
        if(k==1){
            System.out.println("Pesanan "+getJenis()+" Sedang Diproses");
        }else{
            System.out.println(getJenis()+" Tidak ada dalam menu!!");
            System.exit(0);
        }
    }   
}
class Proses extends PesanMinum implements Pesanan{
    int harga, tambahan;
    @Override
    public void panas() {
        setPanas(true);
    }
    @Override
    public void dingin() {
        setPanas(false);
    }
    @Override
    public void harga() {
        if(isPanas()==true){
            tambahan = 0;
            int total = tambahan+harga;
            System.out.println("Harga Tambahan :"+tambahan);
            System.out.println("Total Bayar : "+total);
        }else if(isPanas()==false){
            tambahan = 1000;
            int total = tambahan+harga;
            System.out.println("Harga Tambahan :"+tambahan);
            System.out.println("Total Bayar : "+total);
        }
    }
    public void pilih(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih :\n1. Panas\n2. Dingin");
        int pilih = sc.nextInt();
        setPilih(pilih);
        if(getPilih()==1){
            this.panas();
            System.out.println(getJenis()+" Panas");
        }else if(getPilih()==2){
            this.dingin();
            System.out.println(getJenis()+" Dingin");
        }
        this.hargaMinum();
        this.harga();
    }
    public void Infopesanan(){
        Scanner sc = new Scanner(System.in);
        PesanMinum obj = new PesanMinum();
        System.out.println("Selamat Datang\n");
        obj.ListMinum();
        System.out.println("Ketikan jenis minuman : ");
        String input = sc.nextLine();
        setJenis(input);
    }
    public void hargaMinum(){
        if(getJenis().equalsIgnoreCase("Kopi")){
            harga = 4000;
            System.out.println("Harga Pesanan Kopi : "+harga);
        }else if(getJenis().equalsIgnoreCase("Teh")){
            harga = 3000;
            System.out.println("Harga Pesanan Teh : "+harga);
        }else if(getJenis().equalsIgnoreCase("Susu")){
            harga = 4500;
            System.out.println("Harga Pesanan Susu : "+harga);
        }else if(getJenis().equalsIgnoreCase("STMJ")){
            harga = 6500;
            System.out.println("Harga Pesanan STMJ : "+harga);
        }else if(getJenis().equalsIgnoreCase("Thai tea")){
            harga = 5000;
            System.out.println("Harga Pesanan Thai tea : "+harga);
        }
    }    
}
public class utsPBO_202010370311211 {
    public static void main(String args[]) {
        Proses p = new Proses();
        p.Infopesanan();
        p.verifikasi();
        p.pilih();
        System.out.println("Pesanan Sukses");
    }
}