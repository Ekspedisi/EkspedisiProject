/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.controller;

import ekspedisi.entity.Gabungan;
import ekspedisi.entity.Pabrik;
import ekspedisi.entity.Truk;
import ekspedisi.panel.Direktori;
import ekspedisi.entity.supir;
import ekspedisi.util.Koneksi;
import ekspedisi.util.TableColorRender;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Action;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;

/**
 *
 * @author M Arif Royanto
 */
public class DirektoriController {

    private int Index;
    Direktori dir;
    int ID;
    DefaultTableModel tableModel;
    private String state;

    public DirektoriController(Direktori dir) {
        this.dir = dir;
        dir.getDirCombo().setSelectedIndex(0);
        tableModel = (DefaultTableModel) dir.getTabelDir().getModel();

        ChangeTableModel(getIndex());
        RefreshTabel();

        dir.getAddBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                state = "insert";
                showDialog();
            }
        });
        dir.getEditBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                state = "update";
                System.out.println("state = " + state);
                ID = Integer.parseInt(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 0).toString());
                showDialog();
            }
        });
        dir.getDelBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                state = "delete";
                ID = Integer.parseInt(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 0).toString());
                Delete();
            }
        });

        dir.getAddSupir1().getInputSupir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                InputSupir();
                dir.getDialogSupir().setVisible(false);
            }
        });
        dir.getAddSupir1().getCancelSupir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dir.getDialogSupir().setVisible(false);
            }
        });

        dir.getAddPabrik1().getSaveBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                InputPabrik();
                dir.getDialogPabrik().setVisible(false);
            }
        });
        dir.getAddPabrik1().getCancelBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                dir.getDialogPabrik().setVisible(false);
            }
        });

        dir.getAddTruk1().getSaveBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                inputTruk();
                dir.getDialogTruk().setVisible(false);
            }
        });
        dir.getAddTruk1().getCancelBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                dir.getDialogTruk().setVisible(false);
            }
        });

        dir.getAddGabungan1().getSaveBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                inputPTGabungan();
                dir.getDialogGabungan().setVisible(false);
            }
        });
        dir.getAddGabungan1().getCancelBtn().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                dir.getDialogGabungan().setVisible(false);
            }
        });

        dir.getDirCombo().addItemListener(new comboDirListener());

    }
    
    public void Delete(){
        if(getIndex()==0){
            InputSupir();
        } else if(getIndex()==1){
            inputTruk();
        } else if (getIndex()==2){
            InputPabrik();
        } else if (getIndex()==3){
            inputPTGabungan();
        }
    }

    public void inputTruk() {
        Truk truk = new Truk();
        truk.setMerk(dir.getAddTruk1().getMrekTrukTxt().getText());
        truk.setMuatan(Integer.parseInt(dir.getAddTruk1().getMuatanTxt().getText()));
        truk.setNopol(dir.getAddTruk1().getNoPolTxt().getText());
        truk.setGabungan(dir.getAddTruk1().getPTGabTxt().getText());
        if (getState() == "insert") {
            try {
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "INSERT into Truk VALUES(1,'" + truk.getNopol() + "'," + truk.getMuatan() + ",'" + truk.getMerk() + "','" + truk.getGabungan() + "')";
                System.out.print(sql);
                statement.execute(sql);
                //refresh textfield
                dir.getAddTruk1().getNoPolTxt().setText("");
                dir.getAddTruk1().getMuatanTxt().setText("");
                dir.getAddTruk1().getMrekTrukTxt().setText("");
                dir.getAddTruk1().getPTGabTxt().setText("");
                RefreshTabel();
            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql Truk error");

            }
        } else if (getState() == "update") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "UPDATE Truk SET NomorPolisi = '" + truk.getNopol()
                        + "', Muatan = '" + truk.getMuatan()
                        + "', Merk = '" + truk.getMerk()
                        + "', PTGabungan = '" + truk.getGabungan()
                        + "' WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                //refresh textfield
                dir.getAddTruk1().getNoPolTxt().setText("");
                dir.getAddTruk1().getMuatanTxt().setText("");
                dir.getAddTruk1().getMrekTrukTxt().setText("");
                dir.getAddTruk1().getPTGabTxt().setText("");
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql truk error");

            }
        } else if (getState() == "delete") {
            try {
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "DELETE FROM Truk WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql truk error");

            }
        } else {
            System.out.println("gagal crud");
        }
    }

    public void inputPTGabungan() {
        Gabungan Gab = new Gabungan();
        Gab.setNama(dir.getAddGabungan1().getNamaGabTxt().getText());
        Gab.setAlamat(dir.getAddGabungan1().getAlamatGabTxt().getText());
        Gab.setNorek(dir.getAddGabungan1().getNorekGabTxt().getText());
        Gab.setNarek(dir.getAddGabungan1().getNarekgabTxt().getText());
        Gab.setBank(dir.getAddGabungan1().getBankgabTxt().getText());

        if (getState() == "insert") {
            try {
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "INSERT into PTGabungan VALUES(1,'" + Gab.getNama() + "','" + Gab.getAlamat() + "','" + Gab.getNorek() + "','" + Gab.getNarek() + "','" + Gab.getBank() + "')";

                System.out.print(sql);
                statement.execute(sql);
                //refresh textfield
                dir.getAddGabungan1().getAlamatGabTxt().setText("");
                dir.getAddGabungan1().getBankgabTxt().setText("");
                dir.getAddGabungan1().getNarekgabTxt().setText("");
                dir.getAddGabungan1().getNorekGabTxt().setText("");
                dir.getAddGabungan1().getNamaGabTxt().setText("");
                RefreshTabel();
            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql Gabungan error");
            }
        } else if (getState() == "update") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "UPDATE PTGabungan SET Nama = '" + Gab.getNama()
                        + "', Alamat = '" + Gab.getAlamat()
                        + "', NoRekening = '" + Gab.getNorek()
                        + "', NamaRekening = '" + Gab.getNarek()
                        + "', Bank = '" + Gab.getBank()
                        + "' WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                //refresh textfield
                dir.getAddGabungan1().getAlamatGabTxt().setText("");
                dir.getAddGabungan1().getBankgabTxt().setText("");
                dir.getAddGabungan1().getNarekgabTxt().setText("");
                dir.getAddGabungan1().getNorekGabTxt().setText("");
                dir.getAddGabungan1().getNamaGabTxt().setText("");
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql truk error");

            }
        } else if (getState() == "delete") {
            try {

                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "DELETE FROM PTGabungan WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql supir error");

            }
        } else {
            System.out.println("gagal crud");
        }
    }

    public void InputSupir() {
        // set isi dari entity supir
        supir sup = new supir();
        sup.setNama(dir.getAddSupir1().getNamaSupirTxt().getText());
        sup.setAlamat(dir.getAddSupir1().getAlamatSupirTxt().getText());
        sup.setNorek(dir.getAddSupir1().getNorekSupirTxt().getText());
        sup.setNarek(dir.getAddSupir1().getNarekSupirTxt().getText());
        sup.setBank(dir.getAddSupir1().getBankSupirTxt().getText());
        if (getState() == "insert") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "INSERT into Supir VALUES(1,'" + sup.getNama() + "','" + sup.getAlamat() + "','" + sup.getNorek() + "','" + sup.getNarek() + "','" + sup.getBank() + "')";
                System.out.print(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                //refresh textfield
                dir.getAddSupir1().getNamaSupirTxt().setText("");
                dir.getAddSupir1().getAlamatSupirTxt().setText("");
                dir.getAddSupir1().getNorekSupirTxt().setText("");
                dir.getAddSupir1().getNarekSupirTxt().setText("");
                dir.getAddSupir1().getBankSupirTxt().setText("");
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql supir error");

            }
        } else if (getState() == "update") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "UPDATE Supir SET Nama = '" + sup.getNama()
                        + "', Alamat = '" + sup.getAlamat()
                        + "', NoRekening = '" + sup.getNorek()
                        + "', NamaRekening = '" + sup.getNarek()
                        + "',Bank = '" + sup.getBank()
                        + "' WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                //refresh textfield
                dir.getAddSupir1().getNamaSupirTxt().setText("");
                dir.getAddSupir1().getAlamatSupirTxt().setText("");
                dir.getAddSupir1().getNorekSupirTxt().setText("");
                dir.getAddSupir1().getNarekSupirTxt().setText("");
                dir.getAddSupir1().getBankSupirTxt().setText("");
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql supir error");

            }
        } else if (getState() == "delete") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "DELETE FROM Supir WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql supir error");

            }
        } else {
            System.out.println("gagal crud");
        }
    }

    public void InputPabrik() {
        Pabrik pabrik = new Pabrik();
        pabrik.setNama(dir.getAddPabrik1().getNamaPabrikTxt().getText());
        pabrik.setAlamat(dir.getAddPabrik1().getAlamatPabrikTxt().getText());
        if (state == "insert") {
            try {
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "INSERT into pabrik VALUES(1,'" + pabrik.getNama() + "','" + pabrik.getAlamat() + "')";

                System.out.print(sql);
                statement.execute(sql);
                dir.getAddPabrik1().getNamaPabrikTxt().setText("");
                dir.getAddPabrik1().getAlamatPabrikTxt().setText("");
                RefreshTabel();
            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql pabrik error");

            }
        } else if (getState() == "update") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "UPDATE pabrik SET Nama = '" + pabrik.getNama()
                        + "', Alamat = '" + pabrik.getAlamat()
                        + "' WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                //refresh textfield
                dir.getAddPabrik1().getNamaPabrikTxt().setText("");
                dir.getAddPabrik1().getAlamatPabrikTxt().setText("");
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql supir error");

            }
        } else if (getState() == "delete") {
            try {
                //input database
                Koneksi.createConnection();
                Statement statement = Koneksi.conn.createStatement();
                String sql = "DELETE FROM Pabrik WHERE ID = " + ID;
                System.out.println(sql);
                statement.executeUpdate(sql);
                statement.close();
                Koneksi.closeConnection();
                RefreshTabel();

            } catch (SQLException f) {
                System.out.println(f.getMessage());
                System.out.println("sql supir error");

            }
        } else {
            System.out.println("gagal crud");
        }
    }

    /*
     * Method utk merubah tabel 
     * berdasarkan index di combobox
     */
    public void ChangeTableModel(int index) {

        DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
        model.setRowCount(0);

        if (getIndex() == 0) {
            model.setColumnCount(0);
            model.addColumn("No.");
            model.addColumn("Nama");
            model.addColumn("Alamat");
            model.addColumn("No. Rekening");
            model.addColumn("Atas Nama");
            model.addColumn("Bank");

        } else if (getIndex() == 1) {
            model.setColumnCount(0);
            model.addColumn("No.");
            model.addColumn("No. Polisi");
            model.addColumn("Muatan");
            model.addColumn("Merk");
            model.addColumn("PT.Gabungan");

        } else if (getIndex() == 2) {
            model.setColumnCount(0);
            model.addColumn("No.");
            model.addColumn("Nama Pabrik");
            model.addColumn("Alamat");

        } else if (getIndex() == 3) {
            model.setColumnCount(0);
            model.addColumn("No.");
            model.addColumn("Nama PT.Gabungan");
            model.addColumn("Alamat");
            model.addColumn("No. Rekening");
            model.addColumn("Nama Rekening");
            model.addColumn("Bank");

        }
        ColoringTable();
    }

    public void ColoringTable() {
        for (int i = 0; i < dir.getTabelDir().getColumnCount(); i++) {
            dir.getTabelDir().getColumnModel().getColumn(i).setCellRenderer(new TableColorRender());
        }
    }

    public void isiTabelSupir() {
        try {
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            String sql = "SELECT * FROM SUPIR";
            statement.execute(sql);

            ResultSet rs = statement.getResultSet();

            while ((rs != null) && (rs.next())) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("sql supir error");
        }

    }

    public void IsiTabelTruk() {
        try {
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            String sql = "SELECT * FROM TRUK";
            statement.execute(sql);

            ResultSet rs = statement.getResultSet();

            while ((rs != null) && (rs.next())) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("sql truk error");
        }
    }

    public void IsiTabelPabrik() {
        try {
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            String sql = "SELECT * FROM PABRIK";
            statement.execute(sql);

            ResultSet rs = statement.getResultSet();

            while ((rs != null) && (rs.next())) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("sql pabrik error");
        }
    }

    public void IsiTabelPTgabungan() {
        try {
            Koneksi.createConnection();
            DefaultTableModel model = (DefaultTableModel) dir.getTabelDir().getModel();
            model.setRowCount(0);
            Statement statement = Koneksi.conn.createStatement();
            String sql = "SELECT * FROM PTGABUNGAN";
            statement.execute(sql);

            ResultSet rs = statement.getResultSet();

            while ((rs != null) && (rs.next())) {
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                });
            }
            rs.close();
            statement.close();
            Koneksi.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("sql PT.Gabungan error");
        }
    }

    public void RefreshTabel() {

        if (getIndex() == 0) {
            isiTabelSupir();
        } else if (getIndex() == 1) {
            IsiTabelTruk();
        } else if (getIndex() == 2) {
            IsiTabelPabrik();
        } else if (getIndex() == 3) {
            IsiTabelPTgabungan();
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
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    class comboDirListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            setIndex(dir.getDirCombo().getSelectedIndex());
            ChangeTableModel(getIndex());
            RefreshTabel();

        }

    }

    public void showDialog() {
        if (getIndex() == 0) {
            if (state == "insert") {
                dir.getAddSupir1().getNamaSupirTxt().setText("");
                dir.getAddSupir1().getAlamatSupirTxt().setText("");
                dir.getAddSupir1().getNorekSupirTxt().setText("");
                dir.getAddSupir1().getNarekSupirTxt().setText("");
                dir.getAddSupir1().getBankSupirTxt().setText("");

            } else if (state == "update") {
                ID = Integer.parseInt(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 0).toString());
                dir.getAddSupir1().getNamaSupirTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 1).toString());
                dir.getAddSupir1().getAlamatSupirTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 2).toString());
                dir.getAddSupir1().getNorekSupirTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 3).toString());
                dir.getAddSupir1().getNarekSupirTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 4).toString());
                dir.getAddSupir1().getBankSupirTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 5).toString());

            }
            dir.getDialogSupir().pack();
            dir.getDialogSupir().setLocationRelativeTo(dir);
            dir.getDialogSupir().setVisible(true);

        } else if (getIndex() == 1) {
            if (state == "insert") {
                dir.getAddTruk1().getNoPolTxt().setText("");
                dir.getAddTruk1().getMuatanTxt().setText("");
                dir.getAddTruk1().getMrekTrukTxt().setText("");
                dir.getAddTruk1().getPTGabTxt().setText("");

            } else if (state == "update") {
                ID = Integer.parseInt(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 0).toString());
                dir.getAddTruk1().getNoPolTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 1).toString());
                dir.getAddTruk1().getMuatanTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 2).toString());
                dir.getAddTruk1().getMrekTrukTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 3).toString());
                dir.getAddTruk1().getPTGabTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 4).toString());

            }
            dir.getDialogTruk().pack();
            dir.getDialogTruk().setVisible(true);
            dir.getDialogTruk().setLocationRelativeTo(null);
        } else if (getIndex() == 2) {
            if (state == "insert") {
                dir.getAddPabrik1().getAlamatPabrikTxt().setText("");
                dir.getAddPabrik1().getNamaPabrikTxt().setText("");

            } else if (state == "update") {
                ID = Integer.parseInt(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 0).toString());
                dir.getAddPabrik1().getAlamatPabrikTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 1).toString());
                dir.getAddPabrik1().getNamaPabrikTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 2).toString());
            }
            dir.getDialogPabrik().pack();
            dir.getDialogPabrik().setLocationRelativeTo(null);
            dir.getDialogPabrik().setVisible(true);

        } else if (getIndex() == 3) {
            if (state == "insert") {
                dir.getAddGabungan1().getAlamatGabTxt().setText("");
                dir.getAddGabungan1().getBankgabTxt().setText("");
                dir.getAddGabungan1().getNarekgabTxt().setText("");
                dir.getAddGabungan1().getNorekGabTxt().setText("");
                dir.getAddGabungan1().getNamaGabTxt().setText("");

            } else if (state == "update") {
                ID = Integer.parseInt(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 0).toString());
                dir.getAddGabungan1().getAlamatGabTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 1).toString());
                dir.getAddGabungan1().getBankgabTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 2).toString());
                dir.getAddGabungan1().getNarekgabTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 3).toString());
                dir.getAddGabungan1().getNorekGabTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 4).toString());
                dir.getAddGabungan1().getNamaGabTxt().setText(tableModel.getValueAt(dir.getTabelDir().getSelectedRow(), 5).toString());
            }
            dir.getDialogGabungan().pack();
            dir.getDialogGabungan().setLocationRelativeTo(null);
            dir.getDialogGabungan().setVisible(true);

        }
    }

}
