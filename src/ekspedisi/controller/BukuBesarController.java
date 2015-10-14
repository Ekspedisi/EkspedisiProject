/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;


import ekspedisi.entity.Transaksi;

import ekspedisi.panel.BukuBesar;
import ekspedisi.util.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bimasakti
 */

public class BukuBesarController {
    
    BukuBesar bub;
    private int Index;
    private String DebtabelName;
    private String KretabelName;
    
    public BukuBesarController(BukuBesar bub) {
        this.bub = bub;
        
        bub.getAddBtn().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                bub.getAddTrans().setVisible(true);
                bub.getAddTrans().setLocationRelativeTo(null);
                bub.getAddTrans().pack();
            }
        });
        
        bub.getAddTransaksi1().getSimpanBtn().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("simpan");
                
            }
        });
        
        bub.getAddTransaksi1().getDebitCmb().addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                setIndex(bub.getAddTransaksi1().getDebitCmb().getSelectedIndex());
                String jenis = "debit";
                if (getIndex() == 0) {
                    setDebtabelName("Kas");
                    inputtransaksi( getDebtabelName(), jenis);
                } else if (getIndex()== 1 ){
                    setDebtabelName("Rekening");
                    Transaksi rek = new Transaksi();
                } else if (getIndex()== 2 ){
                    setDebtabelName("BO");
                    
                } else if (getIndex()== 3 ){
                    setDebtabelName("BiayaKantor");
                }
            }
        });
        
        
    }
    
    public void inputtransaksi(String namatabel, String jenis){
        try {
            
            Transaksi trans = new Transaksi();
            if (jenis == "debit"){
            trans.setKeterangan(bub.getAddTransaksi1().getDetailDebit().getText());
            trans.setDebit(Integer.parseInt(bub.getAddTransaksi1().getJumlah().getText()));
            trans.setKredit(0);
            } else {
            trans.setKeterangan(bub.getAddTransaksi1().getDetailKredit().getText());
            trans.setDebit(Integer.parseInt(bub.getAddTransaksi1().getJumlah().getText()));
            trans.setKredit(0);
            }
            Koneksi.createConnection();
            Statement statement = Koneksi.conn.createStatement();
            String sql = "INSERT into "+ getDebtabelName() +" VALUES (1," + trans.getKeterangan() + "," + trans.getDebit() + "," + trans.getKredit()+")";
            System.out.print(sql);
            statement.execute(sql);
        } catch (SQLException f) {
            System.out.println(f.getMessage());
            System.out.println("sql supir error");

        }
    
    }
    /**
     * @return the Index
     */
    public int getIndex() {
        return Index;
    }

    /**
     * @param Index the Index to set
     */
    public void setIndex(int Index) {
        this.Index = Index;
    }

    /**
     * @return the DebtabelName
     */
    public String getDebtabelName() {
        return DebtabelName;
    }

    /**
     * @param DebtabelName the DebtabelName to set
     */
    public void setDebtabelName(String DebtabelName) {
        this.DebtabelName = DebtabelName;
    }

    /**
     * @return the KretabelName
     */
    public String getKretabelName() {
        return KretabelName;
    }

    /**
     * @param KretabelName the KretabelName to set
     */
    public void setKretabelName(String KretabelName) {
        this.KretabelName = KretabelName;
    }

    /**
     * @return the tabelName
     */
    
}
