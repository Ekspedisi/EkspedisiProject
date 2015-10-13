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
public class BO {
    private String tanggal;
    private String keterangan;
    private int kredit;
    private int debit;

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
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the kredit
     */
    public int getKredit() {
        return kredit;
    }

    /**
     * @param kredit the kredit to set
     */
    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    /**
     * @return the debit
     */
    public int getDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(int debit) {
        this.debit = debit;
    }
    
}
