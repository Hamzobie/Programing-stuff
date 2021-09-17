/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

/**
 *
 * @author Hamdani Zulva
 */
public class MerchList {
    private String namaMerch;
    private String stok;
    private String terjual;
    
    public MerchList(String namamerch, String stok, String terjual){
        this.namaMerch = namamerch;
        this.stok = stok;
        this.terjual = terjual;
    }

    public String getNamaMerch() {
        return namaMerch;
    }

    public void setNamaMerch(String namaMerch) {
        this.namaMerch = namaMerch;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getTerjual() {
        return terjual;
    }

    public void setTerjual(String terjual) {
        this.terjual = terjual;
    }
    
    
}
