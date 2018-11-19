
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection conn= null;
        try{
            
            conn= DriverManager.getConnection("jdbc:mysql://localhost/tcc_project","root","Sunnydbestdrink12");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
