/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.panel;

import ekspedisi.controller.DirektoriController;
import java.awt.Color;

/**
 *
 * @author bimasakti
 */
public class Direktori extends javax.swing.JPanel {

    /**
     * Creates new form Direktori
     */
    private DirektoriController controller;
    public Direktori() {
        initComponents();
        controller = new DirektoriController(this);
        setBackground(Color.WHITE);
        TabelDir.setBackground(Color.white);
        TabelDir.enableInputMethods(false);
        
        DelBtn.setEnabled(false);
        if(TabelDir.getSelectedRow()==-1){
            DelBtn.setEnabled(true);
        }
        
        jScrollPane1.getViewport().setOpaque(false);
        TabelDir.setGridColor(TabelDir.getBackground());
        
    }
    
    public void Initialize(){
        controller = new DirektoriController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogSupir = new javax.swing.JDialog();
        addSupir1 = new ekspedisi.panel.AddSupir();
        DialogTruk = new javax.swing.JDialog();
        addTruk1 = new ekspedisi.panel.AddTruk();
        DialogPabrik = new javax.swing.JDialog();
        addPabrik1 = new ekspedisi.panel.AddPabrik();
        DialogGabungan = new javax.swing.JDialog();
        addGabungan1 = new ekspedisi.panel.AddGabungan();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        DirCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDir = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        DialogSupir.setModal(true);
        DialogSupir.setType(java.awt.Window.Type.POPUP);

        addSupir1.setMaximumSize(new java.awt.Dimension(505, 285));
        DialogSupir.getContentPane().add(addSupir1, java.awt.BorderLayout.LINE_END);
        addSupir1.getAccessibleContext().setAccessibleName("AddSupir");

        DialogTruk.getContentPane().add(addTruk1, java.awt.BorderLayout.CENTER);

        DialogPabrik.getContentPane().add(addPabrik1, java.awt.BorderLayout.CENTER);

        DialogGabungan.getContentPane().add(addGabungan1, java.awt.BorderLayout.CENTER);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 450));

        AddBtn.setText("Add");

        EditBtn.setText("Edit");

        DelBtn.setText("Delete");

        DirCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supir", "Truk", "Pabrik", "PT. Gabungan" }));

        jLabel1.setText("Pilih Direktori");

        jLabel2.setText(":");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TabelDir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelDir);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Direktori Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(DirCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn)
                    .addComponent(DelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DelBtn;
    private javax.swing.JDialog DialogGabungan;
    private javax.swing.JDialog DialogPabrik;
    private javax.swing.JDialog DialogSupir;
    private javax.swing.JDialog DialogTruk;
    private javax.swing.JComboBox DirCombo;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTable TabelDir;
    private ekspedisi.panel.AddGabungan addGabungan1;
    private ekspedisi.panel.AddPabrik addPabrik1;
    private ekspedisi.panel.AddSupir addSupir1;
    private ekspedisi.panel.AddTruk addTruk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the AddBtn
     */
    public javax.swing.JButton getAddBtn() {
        return AddBtn;
    }

    /**
     * @return the DelBtn
     */
    public javax.swing.JButton getDelBtn() {
        return DelBtn;
    }

    /**
     * @return the DialogGabungan
     */
    public javax.swing.JDialog getDialogGabungan() {
        return DialogGabungan;
    }

    /**
     * @return the DialogPabrik
     */
    public javax.swing.JDialog getDialogPabrik() {
        return DialogPabrik;
    }

    /**
     * @return the DialogSupir
     */
    public javax.swing.JDialog getDialogSupir() {
        return DialogSupir;
    }

    /**
     * @return the DialogTruk
     */
    public javax.swing.JDialog getDialogTruk() {
        return DialogTruk;
    }

    /**
     * @return the EditBtn
     */
    public javax.swing.JButton getEditBtn() {
        return EditBtn;
    }

    /**
     * @return the addGabungan1
     */
    public ekspedisi.panel.AddGabungan getAddGabungan1() {
        return addGabungan1;
    }

    /**
     * @return the addPabrik1
     */
    public ekspedisi.panel.AddPabrik getAddPabrik1() {
        return addPabrik1;
    }

    /**
     * @return the addSupir1
     */
    public ekspedisi.panel.AddSupir getAddSupir1() {
        return addSupir1;
    }

    /**
     * @return the addTruk1
     */
    public ekspedisi.panel.AddTruk getAddTruk1() {
        return addTruk1;
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox getjComboBox1() {
        return getDirCombo();
    }

    /**
     * @return the TabelDir
     */
    public javax.swing.JTable getTabelDir() {
        return TabelDir;
    }

    /**
     * @return the controller
     */
    public DirektoriController getController() {
        return controller;
    }

    /**
     * @return the DirCombo
     */
    public javax.swing.JComboBox getDirCombo() {
        return DirCombo;
    }
}
