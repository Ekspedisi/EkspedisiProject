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
public class AddPabrik extends javax.swing.JPanel {

    /**
     * Creates new form AddSupir
     */
    public AddPabrik() {
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
        label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AlamatPabrikTxt = new javax.swing.JTextField();
        NamaPabrikTxt = new javax.swing.JTextField();
        NamaBankPabrikTxt = new javax.swing.JTextField();
        NoRekPabrikTxt = new javax.swing.JTextField();
        NamaRekPabrikTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Data Pabrik");

        label.setText("Nama Pabrik");

        jLabel3.setText("Alamat");

        jLabel4.setText("Nomor Rekening");

        jLabel5.setText("Bank");

        jLabel2.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText("Nama Rekening");

        jLabel9.setText(":");

        jLabel10.setText(":");

        AlamatPabrikTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatPabrikTxtActionPerformed(evt);
            }
        });

        NamaPabrikTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPabrikTxtActionPerformed(evt);
            }
        });

        NamaBankPabrikTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaBankPabrikTxtActionPerformed(evt);
            }
        });

        NoRekPabrikTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoRekPabrikTxtActionPerformed(evt);
            }
        });

        NamaRekPabrikTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaRekPabrikTxtActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                    .addComponent(label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 18, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NamaBankPabrikTxt)
                            .addComponent(NoRekPabrikTxt)
                            .addComponent(AlamatPabrikTxt)
                            .addComponent(NamaPabrikTxt)
                            .addComponent(NamaRekPabrikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(jLabel2)
                    .addComponent(NamaPabrikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(AlamatPabrikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoRekPabrikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaBankPabrikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamaRekPabrikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AlamatPabrikTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatPabrikTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatPabrikTxtActionPerformed

    private void NamaPabrikTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPabrikTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPabrikTxtActionPerformed

    private void NamaBankPabrikTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaBankPabrikTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaBankPabrikTxtActionPerformed

    private void NoRekPabrikTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRekPabrikTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoRekPabrikTxtActionPerformed

    private void NamaRekPabrikTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaRekPabrikTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaRekPabrikTxtActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatPabrikTxt;
    private javax.swing.JTextField NamaBankPabrikTxt;
    private javax.swing.JTextField NamaPabrikTxt;
    private javax.swing.JTextField NamaRekPabrikTxt;
    private javax.swing.JTextField NoRekPabrikTxt;
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
    private javax.swing.JLabel label;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the AlamatPabrikTxt
     */
    public javax.swing.JTextField getAlamatPabrikTxt() {
        return AlamatPabrikTxt;
    }

    /**
     * @param AlamatPabrikTxt the AlamatPabrikTxt to set
     */
    public void setAlamatPabrikTxt(javax.swing.JTextField AlamatPabrikTxt) {
        this.AlamatPabrikTxt = AlamatPabrikTxt;
    }

    /**
     * @return the NamaBankPabrikTxt
     */
    public javax.swing.JTextField getNamaBankPabrikTxt() {
        return NamaBankPabrikTxt;
    }

    /**
     * @param NamaBankPabrikTxt the NamaBankPabrikTxt to set
     */
    public void setNamaBankPabrikTxt(javax.swing.JTextField NamaBankPabrikTxt) {
        this.NamaBankPabrikTxt = NamaBankPabrikTxt;
    }

    /**
     * @return the NamaPabrikTxt
     */
    public javax.swing.JTextField getNamaPabrikTxt() {
        return NamaPabrikTxt;
    }

    /**
     * @param NamaPabrikTxt the NamaPabrikTxt to set
     */
    public void setNamaPabrikTxt(javax.swing.JTextField NamaPabrikTxt) {
        this.NamaPabrikTxt = NamaPabrikTxt;
    }

    /**
     * @return the NamaRekPabrikTxt
     */
    public javax.swing.JTextField getNamaRekPabrikTxt() {
        return NamaRekPabrikTxt;
    }

    /**
     * @param NamaRekPabrikTxt the NamaRekPabrikTxt to set
     */
    public void setNamaRekPabrikTxt(javax.swing.JTextField NamaRekPabrikTxt) {
        this.NamaRekPabrikTxt = NamaRekPabrikTxt;
    }

    /**
     * @return the NoRekPabrikTxt
     */
    public javax.swing.JTextField getNoRekPabrikTxt() {
        return NoRekPabrikTxt;
    }

    /**
     * @param NoRekPabrikTxt the NoRekPabrikTxt to set
     */
    public void setNoRekPabrikTxt(javax.swing.JTextField NoRekPabrikTxt) {
        this.NoRekPabrikTxt = NoRekPabrikTxt;
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
