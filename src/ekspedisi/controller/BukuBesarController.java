/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.panel.BukuBesar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author bimasakti
 */

public class BukuBesarController {
    
    BukuBesar bub;
    private int Index;
    private String tabelName;
    
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
                
                if (getIndex() == 1) {
                    System.out.print("set nama tabel : ");
                    setTabelName("Kas");
                    System.out.println(getTabelName());
                } else if (getIndex()== 0 ){
                    System.out.print("set nama tabel : ");
                    setTabelName("tabel kas");
                    System.out.println(getTabelName());
                } else if (getIndex()== 2 ){
                    System.out.print("set nama tabel : ");
                    setTabelName("tabel biaya operasional");
                    System.out.println(getTabelName());
                } else if (getIndex()== 3 ){
                    System.out.print("set nama tabel : ");
                    setTabelName("tabel kantor");
                    System.out.println(getTabelName());
                }
            }
        });
        
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
     * @return the tabelName
     */
    public String getTabelName() {
        return tabelName;
    }

    /**
     * @param tabelName the tabelName to set
     */
    public void setTabelName(String tabelName) {
        this.tabelName = tabelName;
    }
}
