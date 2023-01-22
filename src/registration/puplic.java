///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package registration;
//
//import static java.lang.Class.forName;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
///**
// *
// * @author HP
// */
//public class db {
//   public static Connection mycon(){
//       Connection con = null;
//       try{
//           Class.forName("com.mysql.jdbc.driver");
//           con = DriverManager.getConnection("jbdc:mysql://localhost:8080:3306/login", "root" , "");
//       }catch(Exception e){
//           System.out.println(e);
//       }
//       
//       return con;
//
//        
//    }
//    
//}
//
