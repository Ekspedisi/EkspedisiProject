/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.panel;

import ekspedisi.entity.supir;
import ekspedisi.util.Koneksi;
import java.awt.Dimension;

/**
 *
 * @author bimasakti
 */
public class AddSupir extends javax.swing.JPanel {

    /**
     * Creates new form AddSupir
     */
    public AddSupir() {
        initComponents();
        setSize(new Dimension(505, 285));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namaAddSupir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AlamatSupirTxt = new javax.swing.JTextField();
        NamaSupirTxt = new javax.swing.JTextField();
        BankSupirTxt = new javax.swing.JTextField();
        NorekSupirTxt = new javax.swing.JTextField();
        NarekSupirTxt = new javax.swing.JTextField();
        inputSupir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        cancelSupir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Data Supir");

        namaAddSupir.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Nomor Rekening");

        jLabel5.setText("Bank");

        jLabel2.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText("Nama Rekening");

        jLabel9.setText(":");

        jLabel10.setText(":");

        AlamatSupirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatSupirTxtActionPerformed(evt);
            }
        });

        NamaSupirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaSupirTxtActionPerformed(evt);
            }
        });

        BankSupirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankSupirTxtActionPerformed(evt);
            }
        });

        NorekSupirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorekSupirTxtActionPerformed(evt);
            }
        });

        NarekSupirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NarekSupirTxtActionPerformed(evt);
            }
        });

        inputSupir.setText("save");
        inputSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSupirActionPerformed(evt);
            }
        });

        jLabel11.setText("photo");

        jButton1.setText("Choose Files ..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cancelSupir.setText("cancel");
        cancelSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSupirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelSupir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSupir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namaAddSupir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(63, 63, 63))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NamaSupirTxt)
                            .addComponent(NorekSupirTxt)
                            .addComponent(AlamatSupirTxt)
                            .addComponent(BankSupirTxt)
                            .addComponent(NarekSupirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaAddSupir)
                            .addComponent(jLabel2)
                            .addComponent(NamaSupirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(AlamatSupirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NorekSupirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BankSupirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NarekSupirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputSupir)
                            .addComponent(cancelSupir))
                        .addGap(22, 22, 22))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AlamatSupirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatSupirTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatSupirTxtActionPerformed

    private void NamaSupirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaSupirTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaSupirTxtActionPerformed

    private void BankSupirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankSupirTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankSupirTxtActionPerformed

    private void NorekSupirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorekSupirTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NorekSupirTxtActionPerformed

    private void NarekSupirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NarekSupirTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NarekSupirTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSupirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSupirActionPerformed

    private void cancelSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSupirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelSupirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatSupirTxt;
    private javax.swing.JTextField BankSupirTxt;
    private javax.swing.JTextField NamaSupirTxt;
    private javax.swing.JTextField NarekSupirTxt;
    private javax.swing.JTextField NorekSupirTxt;
    private javax.swing.JButton cancelSupir;
    private javax.swing.JButton inputSupir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel namaAddSupir;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cancelSupir
     */
    public javax.swing.JButton getCancelSupir() {
        return cancelSupir;
    }

    /**
     * @return the inputSupir
     */
    public javax.swing.JButton getInputSupir() {
        return inputSupir;
    }

    /**
     * @return the AlamatSupirTxt
     */
    public javax.swing.JTextField getAlamatSupirTxt() {
        return AlamatSupirTxt;
    }

    /**
     * @return the BankSupirTxt
     */
    public javax.swing.JTextField getBankSupirTxt() {
        return BankSupirTxt;
    }

    /**
     * @return the NamaSupirTxt
     */
    public javax.swing.JTextField getNamaSupirTxt() {
        return NamaSupirTxt;
    }

    /**
     * @return the NarekSupirTxt
     */
    public javax.swing.JTextField getNarekSupirTxt() {
        return NarekSupirTxt;
    }

    /**
     * @return the NorekSupirTxt
     */
    public javax.swing.JTextField getNorekSupirTxt() {
        return NorekSupirTxt;
    }

    /**
     * @param AlamatSupirTxt the AlamatSupirTxt to set
     */
    public void setAlamatSupirTxt(javax.swing.JTextField AlamatSupirTxt) {
        this.AlamatSupirTxt = AlamatSupirTxt;
    }

    /**
     * @param BankSupirTxt the BankSupirTxt to set
     */
    public void setBankSupirTxt(javax.swing.JTextField BankSupirTxt) {
        this.BankSupirTxt = BankSupirTxt;
    }

    /**
     * @param NamaSupirTxt the NamaSupirTxt to set
     */
    public void setNamaSupirTxt(javax.swing.JTextField NamaSupirTxt) {
        this.NamaSupirTxt = NamaSupirTxt;
    }

    /**
     * @param NarekSupirTxt the NarekSupirTxt to set
     */
    public void setNarekSupirTxt(javax.swing.JTextField NarekSupirTxt) {
        this.NarekSupirTxt = NarekSupirTxt;
    }

    /**
     * @param NorekSupirTxt the NorekSupirTxt to set
     */
    public void setNorekSupirTxt(javax.swing.JTextField NorekSupirTxt) {
        this.NorekSupirTxt = NorekSupirTxt;
    }
}
