package pbo;

import java.util.Arrays;

class anggota{
    private String daftarAnggota[];
    private int jumlah;
    private Boolean penuh;

    public anggota(String[] daftarAnggota, int jumlah, Boolean penuh) {
        this.daftarAnggota = daftarAnggota;
        this.jumlah = jumlah;
        this.penuh = penuh;   
    }
    public void data(int max){
        daftarAnggota = new String[max];
        jumlah = 0;
    }
    public void info(){
        System.out.println("Daftar Anggota : "+Arrays.toString(daftarAnggota));
        System.out.println("Jumlah Anggota : "+jumlah);
        System.out.println("Apa kapasitas penuh : "+penuh);
    }
    public void isKosong(){
        penuh = jumlah != 0;
    }
    public void format(){
        daftarAnggota = null;
        jumlah = 0;
    }
    
    public void setDaftar(String[] daftarAnggota) {
        this.daftarAnggota = daftarAnggota;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public void setPenuh(Boolean penuh) {
        this.penuh = penuh;
    }
    public String[] getDaftar() {
        return daftarAnggota;
    }
    public int getJumlah() {
        return jumlah;
    }
    public Boolean getPenuh() {
        return penuh;
    }  
}

public class Tugas1PBO_211 {
    public static void main(String args[]) {
        
    }
}
