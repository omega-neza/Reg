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
public class CoursesDAO {
    
    private String databaseURL="jdbc:postgresql://localhost:5432/test";
private String db_username="postgres";
private String db_password="27502";

    public CoursesDAO() {
    } 

public String addCourse(Course course ){
    try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    
    //for integers you use only one single set of quotation marks
    //the line below is used so that when you select one lecturer it will be many times it will be able to work
    
    String id= course.getCourse_id()+"-"+course.getStudent_id_fk();
    
    //the "id" we have used below will be auto generated from the id above
    
    String sql="insert into course (course_id, course_name, lecture_id_fk, student_id_fk)values('"+id+"', '"+course.getCourse_name ()+"',"+course.getLecturer_id_fk()+","+course.getStudent_id_fk()+")";
    int numberOfRowsAffected=st.executeUpdate(sql);
     if(numberOfRowsAffected>=1){
     return"The data was saved successfully";
     }
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }   
    
return"The data was not saved";
}
    
    
}
