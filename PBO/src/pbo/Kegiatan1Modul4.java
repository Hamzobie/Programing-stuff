package pbo;

abstract class BangunRuang{
    abstract void getLuasPermukaan();
    abstract void getVolume();
}
class Tabung extends BangunRuang{
    double jari, tinggi;
    Tabung(double jari, double tinggi){
        this.jari=jari;
        this.tinggi=tinggi;
    }
    @Override
    void getLuasPermukaan() {
        System.out.println("Luas permukaan Tabung adalah :"+2*3.14*jari*(jari+tinggi));
    }
    @Override
    void getVolume() {
        System.out.println("Volume dari Tabung adalah : "+3.14*jari*jari*tinggi);
    }
    
}
class Balok extends BangunRuang{
    double panjang, lebar, tinggi;
    Balok(double panjang,double lebar,double tinggi){
        this.lebar=lebar;
        this.panjang=panjang;
        this.tinggi= tinggi;
    }
    @Override
    void getLuasPermukaan() {
        System.out.println("Luas Permukaan Balok adalah : "+2*(panjang*lebar+panjang*tinggi+lebar*tinggi));
    }
    @Override
    void getVolume() {
        System.out.println("Volume dari Balok adalah : "+panjang*lebar*tinggi);
    }
    
}
public class Kegiatan1Modul4 {
    public static void main(String args[]) {
        BangunRuang b = new Balok(9, 5, 7);
        BangunRuang t = new Tabung(7, 9);
        b.getLuasPermukaan();
        b.getVolume();
        t.getLuasPermukaan();
        t.getVolume();
    }
}
