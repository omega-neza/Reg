/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.Discipline;
import model.Student;

/**
 *
 * @author omega
 */
public class DisciplineDAO {
     private String databaseURL="jdbc:postgresql://localhost:5432/test";
private String db_username="postgres";
private String db_password="27502";
    
 

public String saveStudentDiscipline(Discipline disp ){
    try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    //Statement st=conn.createStatement();
    //String sql="insert into discipline ( student_id_fk, reason, record_date)" +" values("+disp.getStudent_id_fk()+",'"+disp.getReason()+"','"+disp.getRecordDate()+"')";
    
    //another way to do the above commented stuff
    PreparedStatement st= conn.prepareStatement("insert into discipline values(?, ? ,?)");
    st.setInt(1, disp.getStudent_id_fk());
    st.setString(2, disp.getReason());
    st.setDate(3, new java.sql.Date(disp.getRecordDate().getTime()));
    int numberOfRowsAffected=st.executeUpdate();
     if(numberOfRowsAffected>=1){
     return"The data was saved successfully";
     }
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }   
    
return"The data was not saved";
}
}