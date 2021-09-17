package pbo;
import java.io.*;
import java.util.*;
class RekapNilai{
    private int nilai;
    private String matkul;
    private String nama;

    public int getNilai() {
        return nilai;
    }
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    public String getMatkul() {
        return matkul;
    }
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void WriteData() throws InputMismatchException, IOException{
        Scanner sc = new Scanner(System.in);
        FileWriter w = new FileWriter("rekapnilai.txt",true); 
       
            System.out.println("Masukan Nilai : ");
            setNilai(sc.nextInt());
            System.out.println("Masukan Mata Kuliah : ");
            setMatkul(sc.next());
            System.out.println("Masukan Nama : ");
            setNama(sc.next());

            w.write("Nilai : "+getNilai());
            w.write("\nMata Kuliah : "+getMatkul());
            w.write("\nNama : "+getNama());
            w.write("\n\n");
            w.close();
               
    }
    public void ReadData() throws FileNotFoundException{
        File f = new File("rekapnilai.txt");
        Scanner sc = new Scanner(f);
        if(f.length()<=0){
            throw new NullPointerException();
        }
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
    }
}
public class Modul5 {
    public static void main(String args[]) {
        RekapNilai p = new RekapNilai();
        Scanner sc = new Scanner(System.in);
        System.out.println("  ==== SELAMAT DATANG ====");
        System.out.println("===-APlIKASI REKAPITULASI-===\n");
        System.out.println("1. Memasukan Data");
        System.out.println("2. Menampilkan Data");
        System.out.println("3. Keluar\n");
        System.out.println("   Pilihan : ");
        int i = sc.nextInt();
        switch (i){
            case 1 : {
                try {
                    p.WriteData();
                } catch (InputMismatchException | IOException ex) {
                    System.out.println("Error Occured : "+ex);
                }finally{
                    Modul5.main(null);
                }
                
            }
            case 2 : {
                try {
                    System.out.println("== Data Rekapitulasi ==");
                    p.ReadData();
                } catch (FileNotFoundException ex) {
                    System.out.println("Error Occured : "+ex);
                    System.out.println("File Tidak Ditemukan!!!");
                } catch (NullPointerException ex) {
                    System.out.println("Error Occured : "+ex);
                    System.out.println("File Kosong!!!");
                }finally{
                    Modul5.main(null);
                }
            }
            case 3 : System.exit(0);
        }        
    }
}
