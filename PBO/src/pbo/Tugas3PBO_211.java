package pbo;
import java.util.Scanner;
class MusicPlayer{
    private int volume;
    private boolean status;

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public MusicPlayer(){
        volume = 0;
        status = false;
    }
}
interface Audio{
    public void tambahVolume();
    public void kurangVolume();
}
interface Control{
    public void play();
    public void stop();
}
class WMP extends MusicPlayer implements Audio,Control {
    
    public void InfoDetail(){ 
        if(isStatus()==true){
            System.out.println("Kondisi WMP saat ini nyala dengan volume : "+getVolume()+"\n");
        }else if(isStatus()==false){
            System.out.println("Kondisi WMP saat ini mati dengan volume : "+getVolume()+"\n");
        }
    }  
    @Override
    public void tambahVolume() {
        int vol=getVolume();
        if(getVolume()<10){
            vol++;
            setVolume(vol);
            System.out.println(getVolume()+"\n");
            System.out.println("\nVolume berhasil dinaikan\n");
        }else if(getVolume()==10){
            System.out.println("\nVolume sudah mencapai "+getVolume()+"\n");
        }
    }
    @Override
    public void kurangVolume() {
        int vol=getVolume();
        if(getVolume()>0){
            vol--;
            setVolume(vol);
            System.out.println(getVolume()+"\n");
            System.out.println("\nVolume berhasil diturunkan\n");
        }else if(getVolume()==0){
            System.out.println("\nVolume sudah mencapai "+getVolume()+"\n");
        }       
    }

    @Override
    public void play() {
        setStatus(true);
        System.out.println("\nMenyalakan WMP\n");
    }
    @Override
    public void stop() {
        setStatus(false);
        System.out.println("\nMematikan WMP\n");
    }
}

public class Tugas3PBO_211 extends WMP{
    public static void main(String[] args) {
      WMP wmp = new WMP();
      Scanner sc = new Scanner(System.in);  
      while(true){
      System.out.println("Selamat Datang");
      System.out.println("1. Play\n2. Stop\n3. Tambah Volume\n4. Kurangi Volume\n5. Keluar");
      System.out.println("Masukan Pilihan : ");
      int i = sc.nextInt();
        switch (i) {
            case 1 -> {
                wmp.play();
                wmp.InfoDetail();
            }
            case 2 -> {
                wmp.stop();
                wmp.InfoDetail();
            }
            case 3 -> {
                wmp.tambahVolume();
                wmp.InfoDetail();
            }
            case 4 -> {
                wmp.kurangVolume();
                wmp.InfoDetail();
            }
            case 5 -> {
                System.exit(0);
            }
            default -> {
            }
        }      
     }
    } 
}
//Hamdani Zulva
//211 / E