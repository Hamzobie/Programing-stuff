package pbo;

class Nilai{
    private double daftarNilai[];
    private String nama;

    public double[] getDaftarNilai() {
        return daftarNilai;
    }
    public void setDaftarNilai(double[] daftarNilai) {
        this.daftarNilai = daftarNilai;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public Nilai(String nama, int jumlah) {
        this.nama = nama;
        this.daftarNilai= new double[jumlah];
    } 
}
class NilaiMhs extends Nilai{
    private String nim;
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public NilaiMhs(String nim, String nama, int jumlah) {
        super(nama, jumlah);
        this.nim = nim;
    }
    public double getIPS(int jumlah){
        double sum =0, ips = 0, n;
        for(double i : getDaftarNilai()){
            sum=sum+i;
        }
        n= sum*jumlah*2/(2*jumlah);
        if(n>=0&& n<=15){
            ips = 0;
        }else if(n>=16 && n<=30){
            ips = 1;
        }else if(n>=31 && n<=45){
            ips = 2;
        }else if(n>45 && n<=60){
            ips = 2.5;
        }else if(n>60 && n<=75){
            ips =3;
        }else if(n>75 && n<=90){
            ips = 3.5;
        }else if(n>90 && n<=100){
            ips = 4;
        }
        return ips;
    }
}
class NilaiSiswa extends Nilai{
    private String nis;

    public String getNis() {
        return nis;
    }
    public void setNis(String nis) {
        this.nis = nis;
    }
    
    public NilaiSiswa(String nis, String nama, int jumlah) {
        super(nama, jumlah);
        this.nis = nis;
    }
    public double getAvg(int jumlah){
        double sum =0;
        for(double i : getDaftarNilai()){
            sum=sum+i;
        }
        return sum/jumlah;
    }
    public double getMax(){
        double max=0;
        for(double i : getDaftarNilai()){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    public double getMin(){
        double min = 100;
        for(double i : getDaftarNilai()){
            if(i<min){
                min=i;
            }
        }
        return min;
    }

}

public class DemoNilai {
    public static void main(String args[]) {
        double array[]={89.0,87.9};
        NilaiSiswa n1 = new NilaiSiswa("202010370311211", "Hamdani Zulva", 2);
        NilaiMhs n2 = new NilaiMhs("202010370311211", "Hamdani Zulva", 2);
        n1.setDaftarNilai(array);
        n2.setDaftarNilai(array);
        System.out.println(n1.getAvg(2));
        System.out.println(n2.getIPS(2));
    }
}
