    package dbstuff; // nama pacage seusuai dengan nama project

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi { // koneksi ke database
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
    if(mysqlkonek==null){
        try {
            String DB="jdbc:mysql://localhost:3306/shitdb"; // nama database
            String user="root"; // user database
            String pass="root"; // password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"gagal koneksi");
        }
    }
    return mysqlkonek;
    }
}
