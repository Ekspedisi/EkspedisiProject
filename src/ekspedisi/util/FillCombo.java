/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.util;
import ekspedisi.util.Koneksi;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author amateur
 */
public class FillCombo {
    
    public FillCombo(String sql, String Combo) throws SQLException{
        Koneksi.createConnection();
            Statement statement = Koneksi.conn.createStatement();
            //String sql = "INSERT into Supir VALUES(1,'" + sup.getNama() + "','" + sup.getAlamat() + "','" + sup.getNorek() + "','" + sup.getNarek() + "','" + sup.getBank() + "')";
            System.out.print(sql);
            statement.execute(sql);
    }
}
