package pl;

public class KonversiHari {
    public static void main(String args[]) {
        int JHari=576; 
        int Hari, Tahun,Bulan;
        Tahun = (JHari/365);
        Bulan = (JHari % 365)/30;
        Hari =  (JHari % 365) % 30;
                
        output(JHari, Tahun, Bulan, Hari);
    }

    private static void output(int JHari, int Tahun, int Bulan, int Hari) {
        System.out.println("Jumlah Hari : "+JHari);
        System.out.println(Tahun+" Tahun "+Bulan+" Bulan "+Hari+" Hari.");
    }
}
