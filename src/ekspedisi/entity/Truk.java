/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.entity;

/**
 *
 * @author amateur
 */
public class Truk {
    private String Merk;
    private int muatan;
    private String Nopol;
    private String Gabungan;

    /**
     * @return the Merk
     */
    public String getMerk() {
        return Merk;
    }

    /**
     * @param Merk the Merk to set
     */
    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    /**
     * @return the muatan
     */
    public int getMuatan() {
        return muatan;
    }

    /**
     * @param muatan the muatan to set
     */
    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }

    /**
     * @return the Nopol
     */
    public String getNopol() {
        return Nopol;
    }

    /**
     * @param Nopol the Nopol to set
     */
    public void setNopol(String Nopol) {
        this.Nopol = Nopol;
    }

    /**
     * @return the Gabungan
     */
    public String getGabungan() {
        return Gabungan;
    }

    /**
     * @param Gabungan the Gabungan to set
     */
    public void setGabungan(String Gabungan) {
        this.Gabungan = Gabungan;
    }
    
}
