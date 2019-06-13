package schoolmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFunction {
    public static int countData(String tableName){
        
        int total = 0;
        Connection con = MyConnection.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS `total` FROM "+tableName);
            while(rs.next()){
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement st;
        
        
        
        return total;
    }
    
}
// SELECT COUNT(*) AS `total` FROM `user`
