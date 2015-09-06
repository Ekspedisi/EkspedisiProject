/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.view;

import ekspedisi.controller.LandingController;

/**
 *
 * @author M Arif Royanto
 */
public class MainFrame extends javax.swing.JFrame {

    private static MainFrame instance;
    /**
     * Creates new form MainFrame
     */
    LandingController controller;
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        controller = new LandingController(MainPanel, this);
    }
    
    public static MainFrame getInstace(){
        if (instance == null) {
            instance = new MainFrame();
        }
        return instance;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TittlePanel = new javax.swing.JPanel();
        TittleText1 = new javax.swing.JLabel();
        TittleText2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        DirektoriBtn = new javax.swing.JButton();
        OrderBtn = new javax.swing.JButton();
        PremiBtn = new javax.swing.JButton();
        LapRekBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        homePanel1 = new ekspedisi.panel.HomePanel();
        direktori1 = new ekspedisi.panel.Direktori();
        orderPanel1 = new ekspedisi.panel.OrderPanel();
        premiSupirPanel1 = new ekspedisi.panel.PremiSupirPanel();
        laporanRekening1 = new ekspedisi.panel.LaporanRekening();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BgPanel.setBackground(new java.awt.Color(242, 242, 242));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TittlePanel.setBackground(new java.awt.Color(255, 255, 255));

        TittleText1.setText("Perusahaan Angkutan");

        TittleText2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TittleText2.setText("SUMBER MAKMUR");

        jLabel1.setText("Jalan Green Ville Blok AI no. 06 - Jakarta Barat");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ekspedisi/image/logosementara.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout TittlePanelLayout = new javax.swing.GroupLayout(TittlePanel);
        TittlePanel.setLayout(TittlePanelLayout);
        TittlePanelLayout.setHorizontalGroup(
            TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TittlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TittleText2)
                    .addComponent(jLabel1)
                    .addComponent(TittleText1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TittlePanelLayout.setVerticalGroup(
            TittlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TittlePanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TittlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittleText1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TittleText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        HomeBtn.setBackground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Home");

        DirektoriBtn.setBackground(new java.awt.Color(255, 255, 255));
        DirektoriBtn.setText("Direktori");

        OrderBtn.setBackground(new java.awt.Color(255, 255, 255));
        OrderBtn.setText("Order");

        PremiBtn.setBackground(new java.awt.Color(255, 255, 255));
        PremiBtn.setText("Premi Supir");

        LapRekBtn.setBackground(new java.awt.Color(255, 255, 255));
        LapRekBtn.setText("Laporan Rekening");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DirektoriBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PremiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LapRekBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DirektoriBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PremiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LapRekBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MainPanel.setPreferredSize(new java.awt.Dimension(600, 450));
        MainPanel.setRequestFocusEnabled(false);
        MainPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(homePanel1, "home");
        MainPanel.add(direktori1, "direktori");
        MainPanel.add(orderPanel1, "order");
        MainPanel.add(premiSupirPanel1, "premi");
        MainPanel.add(laporanRekening1, "laprek");

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(BgPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JButton DirektoriBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton LapRekBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JButton PremiBtn;
    private javax.swing.JPanel TittlePanel;
    private javax.swing.JLabel TittleText1;
    private javax.swing.JLabel TittleText2;
    private ekspedisi.panel.Direktori direktori1;
    private ekspedisi.panel.HomePanel homePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private ekspedisi.panel.LaporanRekening laporanRekening1;
    private ekspedisi.panel.OrderPanel orderPanel1;
    private ekspedisi.panel.PremiSupirPanel premiSupirPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the DirektoriBtn
     */
    public javax.swing.JButton getDirektoriBtn() {
        return DirektoriBtn;
    }

    /**
     * @return the HomeBtn
     */
    public javax.swing.JButton getHomeBtn() {
        return HomeBtn;
    }

    /**
     * @return the LapRekBtn
     */
    public javax.swing.JButton getLapRekBtn() {
        return LapRekBtn;
    }

    /**
     * @return the MainPanel
     */
    public javax.swing.JPanel getMainPanel() {
        return MainPanel;
    }

    /**
     * @return the OrderBtn
     */
    public javax.swing.JButton getOrderBtn() {
        return OrderBtn;
    }

    /**
     * @return the PremiBtn
     */
    public javax.swing.JButton getPremiBtn() {
        return PremiBtn;
    }
}
