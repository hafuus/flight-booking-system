/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class db {
   public static Connection mycon(){
       Connection con = null;
       try{
//           Class.forName("com.mysql.jdbc.Driver");
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root" , "");
           System.out.println("connected");
       }catch(Exception e){
           System.out.println(e);
       }
       
       return con;

        
    }
    
}
