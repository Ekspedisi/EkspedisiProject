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
public class AddTruk extends javax.swing.JPanel {

    /**
     * Creates new form AddSupir
     */
    public AddTruk() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NoPolTxt = new javax.swing.JTextField();
        MrekTrukTxt = new javax.swing.JTextField();
        MuatanTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Data Truk");

        namaAddSupir.setText("Merk Truk");

        jLabel3.setText("Nomor Polisi");

        jLabel4.setText("Muatan Max");

        jLabel2.setText(":");

        jLabel6.setText(":");

        jLabel7.setText(":");

        NoPolTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoPolTxtActionPerformed(evt);
            }
        });

        MrekTrukTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MrekTrukTxtActionPerformed(evt);
            }
        });

        MuatanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuatanTxtActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(326, Short.MAX_VALUE)
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(namaAddSupir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoPolTxt)
                            .addComponent(MrekTrukTxt)
                            .addComponent(MuatanTxt))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaAddSupir)
                    .addComponent(jLabel2)
                    .addComponent(MrekTrukTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(NoPolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MuatanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NoPolTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoPolTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoPolTxtActionPerformed

    private void MrekTrukTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MrekTrukTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MrekTrukTxtActionPerformed

    private void MuatanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuatanTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MuatanTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MrekTrukTxt;
    private javax.swing.JTextField MuatanTxt;
    private javax.swing.JTextField NoPolTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel namaAddSupir;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the MrekTrukTxt
     */
    public javax.swing.JTextField getMrekTrukTxt() {
        return MrekTrukTxt;
    }

    /**
     * @param MrekTrukTxt the MrekTrukTxt to set
     */
    public void setMrekTrukTxt(javax.swing.JTextField MrekTrukTxt) {
        this.MrekTrukTxt = MrekTrukTxt;
    }

    /**
     * @return the MuatanTxt
     */
    public javax.swing.JTextField getMuatanTxt() {
        return MuatanTxt;
    }

    /**
     * @param MuatanTxt the MuatanTxt to set
     */
    public void setMuatanTxt(javax.swing.JTextField MuatanTxt) {
        this.MuatanTxt = MuatanTxt;
    }

    /**
     * @return the NoPolTxt
     */
    public javax.swing.JTextField getNoPolTxt() {
        return NoPolTxt;
    }

    /**
     * @param NoPolTxt the NoPolTxt to set
     */
    public void setNoPolTxt(javax.swing.JTextField NoPolTxt) {
        this.NoPolTxt = NoPolTxt;
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
