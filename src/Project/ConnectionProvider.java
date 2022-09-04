/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import java.lang.*;
/**
 *
 * @author Aniruddh
 */


public class ConnectionProvider {
    
    Connection con = null;
    
    public ConnectionProvider() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "0302");           
        } catch (Exception e) {
           System.err.println(e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return this.con;
    } 
}
