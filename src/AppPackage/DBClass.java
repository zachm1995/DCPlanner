/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Zach
 */
public class DBClass {
    Connection conn;
    public static boolean success;
    
    DBClass(){
        try{
            String filename = "dtabsDCPlanner.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim() + ";DriverID=22;READONLY=false}";
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://dtabsDCPlanner.mdb");
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    public void WriteToDB(String username, String password){
        success = false;
        try{
            String filename = "dtabsDCPlanner.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim() + ";DriverID=22;READONLY=false}";
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://dtabsDCPlanner.mdb");
            
            Statement sta = conn.createStatement();
            
            int state = sta.executeUpdate("INSERT INTO Logins (Username, Password, Administrator) VALUES ('" + username + "', '" + password + "', '" + "false" + "')");
            success = true;
        }   
        catch (Exception e){
            success = false;
            System.out.println(e);
        }
    }
    public boolean checkLogin(String username, String password){
        boolean check = false;
        
        try{
            String filename = "dtabsDCPlanner.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim() + ";DriverID=22;READONLY=false}";
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://dtabsDCPlanner.mdb");
            
            Statement sta = conn.createStatement();
            String sql = "SELECT * FROM Logins WHERE Username = '" + username + "' AND Password = '" + password + "' ";
            ResultSet rs = sta.executeQuery(sql);
            
            while(rs.next()){
                check = true;
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        return check;
    }
    public boolean checkAdminLogin(String username, String password){
        boolean check = false;
        
        try{
            String filename = "dtabsDCPlanner.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim() + ";DriverID=22;READONLY=false}";
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://dtabsDCPlanner.mdb");
            
            Statement sta = conn.createStatement();
            String sql = "SELECT * FROM Logins WHERE Username = '" + username + "' AND Password = '" + password + "' AND Administrator = '" + true + "' ";
            ResultSet rs = sta.executeQuery(sql);
            
            while(rs.next()){
                check = true;
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        return check;
    }
}
