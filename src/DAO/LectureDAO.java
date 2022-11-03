/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.*;
import model.*;

/**
 *
 * @author omega
 */
public class LectureDAO {
    private String databaseURL="jdbc:postgresql://localhost:5432/test";
private String db_username="postgres";
private String db_password="27502";

public LectureDAO() {
    } 
////save

public String saveLecture(Lecturer lecturer){
    try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    String sql="insert into lecturer (lecturer_id, lecturer_names)values("+lecturer.getLecture_id()+", '"+lecturer.getLecturer_names ()+"')";
    int numberOfRowsAffected=st.executeUpdate(sql);
     if(numberOfRowsAffected>=1){
     return"The data was saved successfully";
     }
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }   
    
return"The data was not saved";
}

///////////////////////////
//method for putting lecturer in combo box

public ResultSet getAllLecturer(){
try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    String sql="select*from lecturer ";
   ResultSet result= st.executeQuery(sql);
     return result;
  
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }   
    return null;
}
}