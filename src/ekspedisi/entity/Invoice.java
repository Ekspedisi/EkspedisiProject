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
public class Invoice {
    private String noInv;
    private String noDm;
    private String tanggal;
    private String nopol;
    private String pengirim;
    private String tujuan;
    private int berat;
    private int ongkos;
    private int jumlah;

    /**
     * @return the noInv
     */
    public String getNoInv() {
        return noInv;
    }

    /**
     * @param noInv the noInv to set
     */
    public void setNoInv(String noInv) {
        this.noInv = noInv;
    }

    /**
     * @return the noDm
     */
    public String getNoDm() {
        return noDm;
    }

    /**
     * @param noDm the noDm to set
     */
    public void setNoDm(String noDm) {
        this.noDm = noDm;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the nopol
     */
    public String getNopol() {
        return nopol;
    }

    /**
     * @param nopol the nopol to set
     */
    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    /**
     * @return the pengirim
     */
    public String getPengirim() {
        return pengirim;
    }

    /**
     * @param pengirim the pengirim to set
     */
    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the ongkos
     */
    public int getOngkos() {
        return ongkos;
    }

    /**
     * @param ongkos the ongkos to set
     */
    public void setOngkos(int ongkos) {
        this.ongkos = ongkos;
    }

    /**
     * @return the jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
}
