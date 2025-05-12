/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*conectivity of data base using sql work bench*/
package travel.management.system;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///tms","root","123456"); 
            
            s =c.createStatement();  
            
           
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}  
