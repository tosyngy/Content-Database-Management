/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcontent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class DbConnect {

    public Connection con;
    public ResultSet rs;
    public PreparedStatement ps;
    public Statement st;
    JOptionPane jp;

    public DbConnect() {
        jp = new JOptionPane();
        try {

            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "diagnosis";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                con = DriverManager.getConnection(url + dbName, userName, password);
                st = con.createStatement();
                //System.out.println("Connected to the database");
            } catch (Exception e) {
                int chk = jp.showConfirmDialog(null, ", Connect to the server not Established, Check your Database config files", "Database", jp.YES_NO_CANCEL_OPTION);
                if (chk == 0) {
                    new DbConnect();
                } else {
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("connector Error  " + e);
        }

    }

}
