package schoolmanagement;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
