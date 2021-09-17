package pbo;
class hitung{
    private double r;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    
    public void keliling(){
        double k ;
        k = 3.14*getR()*2;
        System.out.println("Keliling lingkaran: "+k);
    }
    public void luas(){
        double l;
        l = 3.14*getR()*getR();
        System.out.println("Luas lingkaran : "+l);
    }
}

