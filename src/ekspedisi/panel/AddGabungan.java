/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.panel;

/**
 *
 * @author bimasakti
 */
public class AddGabungan extends javax.swing.JPanel {

    /**
     * Creates new form AddSupir
     */
    public AddGabungan() {
        initComponents();
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
        AlamatGabTxt = new javax.swing.JTextField();
        NamaGabTxt = new javax.swing.JTextField();
        BankgabTxt = new javax.swing.JTextField();
        NorekGabTxt = new javax.swing.JTextField();
        NarekgabTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Data PT Gabungan");

        namaAddSupir.setText("Nama Gabungan");

        jLabel3.setText("Alamat");

        jLabel4.setText("Nomor Rekening");

        jLabel5.setText("Bank");

        jLabel2.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText("Nama Rekening");

        jLabel9.setText(":");

        jLabel10.setText(":");

        AlamatGabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatGabTxtActionPerformed(evt);
            }
        });

        NamaGabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaGabTxtActionPerformed(evt);
            }
        });

        BankgabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankgabTxtActionPerformed(evt);
            }
        });

        NorekGabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorekGabTxtActionPerformed(evt);
            }
        });

        NarekgabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NarekgabTxtActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(saveBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(namaAddSupir))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BankgabTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NarekgabTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NamaGabTxt)
                                        .addComponent(AlamatGabTxt)
                                        .addComponent(NorekGabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaAddSupir)
                    .addComponent(jLabel2)
                    .addComponent(NamaGabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(AlamatGabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorekGabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankgabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NarekgabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AlamatGabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatGabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatGabTxtActionPerformed

    private void NamaGabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaGabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaGabTxtActionPerformed

    private void BankgabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankgabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankgabTxtActionPerformed

    private void NorekGabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorekGabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NorekGabTxtActionPerformed

    private void NarekgabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NarekgabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NarekgabTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatGabTxt;
    private javax.swing.JTextField BankgabTxt;
    private javax.swing.JTextField NamaGabTxt;
    private javax.swing.JTextField NarekgabTxt;
    private javax.swing.JTextField NorekGabTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel namaAddSupir;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the AlamatGabTxt
     */
    public javax.swing.JTextField getAlamatGabTxt() {
        return AlamatGabTxt;
    }

    /**
     * @param AlamatGabTxt the AlamatGabTxt to set
     */
    public void setAlamatGabTxt(javax.swing.JTextField AlamatGabTxt) {
        this.AlamatGabTxt = AlamatGabTxt;
    }

    /**
     * @return the BankgabTxt
     */
    public javax.swing.JTextField getBankgabTxt() {
        return BankgabTxt;
    }

    /**
     * @param BankgabTxt the BankgabTxt to set
     */
    public void setBankgabTxt(javax.swing.JTextField BankgabTxt) {
        this.BankgabTxt = BankgabTxt;
    }

    /**
     * @return the NamaGabTxt
     */
    public javax.swing.JTextField getNamaGabTxt() {
        return NamaGabTxt;
    }

    /**
     * @param NamaGabTxt the NamaGabTxt to set
     */
    public void setNamaGabTxt(javax.swing.JTextField NamaGabTxt) {
        this.NamaGabTxt = NamaGabTxt;
    }

    /**
     * @return the NarekgabTxt
     */
    public javax.swing.JTextField getNarekgabTxt() {
        return NarekgabTxt;
    }

    /**
     * @param NarekgabTxt the NarekgabTxt to set
     */
    public void setNarekgabTxt(javax.swing.JTextField NarekgabTxt) {
        this.NarekgabTxt = NarekgabTxt;
    }

    /**
     * @return the NorekGabTxt
     */
    public javax.swing.JTextField getNorekGabTxt() {
        return NorekGabTxt;
    }

    /**
     * @param NorekGabTxt the NorekGabTxt to set
     */
    public void setNorekGabTxt(javax.swing.JTextField NorekGabTxt) {
        this.NorekGabTxt = NorekGabTxt;
    }

    /**
     * @return the cancelBtn
     */
    public javax.swing.JButton getCancelBtn() {
        return cancelBtn;
    }

    /**
     * @return the saveBtn
     */
    public javax.swing.JButton getSaveBtn() {
        return saveBtn;
    }
}
