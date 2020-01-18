/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr Adil
 */
public class DB {
    Connection conn;
  //to create a connection
  public Connection db(){
     String DBMS = "mysql";
        String serverName = "localhost";
        String port = "3306";
        String userName = "root";
        String databaseName = "clinic";
        String ConUrl = "jdbc:"+DBMS+"://"+serverName+":"+port+"/"+databaseName;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(ConUrl,userName,"");

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"check the database connection.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn; 
  }
  
  //for excuting a query
  public boolean query(String query){
         Connection conn2 = this.db();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         try{
            stmt = conn2.prepareStatement(query);
            stmt.execute(query);
            
            
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
             //JOptionPane.showMessageDialog(null,"Cannot excute the query, something went wrong! ", "Error", JOptionPane.ERROR_MESSAGE);
         }
        return true;
         
     }
  
  
  //the deletion method
   public  boolean delete(String table,int id){
        String query = "DELETE FROM " +table+" where id = "+id ;
        return this.query(query);
     }
   
   //insertion method
    public boolean insert(String table, String fields , String values){
        String query = "INSERT INTO "+ table +" ( "+ fields +" ) VALUES ( "+ values +" );";  
        return this.query(query);
     }
    
    
    //editing method
     public boolean edit(String table, String fields , String where){
        String query = "UPDATE `"+ table +"` SET "+fields+" WHERE `"+ table +"`."+where+";";
        return this.query(query);
     }
     
     //for getting a method
      public ResultSet get(String query){
         Connection conn2 = this.db();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         try{
            stmt = conn2.prepareStatement(query);
            rs = stmt.executeQuery(query); 
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Cannot excute the query, something went wrong! ", "Error", JOptionPane.ERROR_MESSAGE);
         }
         
         return rs;
         
     
     }
    
}
