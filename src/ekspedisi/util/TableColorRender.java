/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author GUE
 */
public class TableColorRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column); //To change body of generated methods, choose Tools | Templates.
        label.setOpaque(true);

        if (bln) {
            label.setBackground(jtable.getSelectionBackground());
        } else {
            if (row % 2 == 1) {
                label.setBackground(new Color(237, 243, 254));
            } else {
                label.setBackground(Color.white);
            }
        }

        return label;
    }

}
