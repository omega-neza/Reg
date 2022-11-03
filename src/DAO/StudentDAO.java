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
public class StudentDAO {
private String databaseURL="jdbc:postgresql://localhost:5432/test";
private String db_username="postgres";
private String db_password="27502";
//Save

    public StudentDAO() {
    } 

public String saveStudent(Student student ){
    try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    String sql="insert into student(student_id, student_names)values("+student.getStudent_id()+", '"+student.getStudent_names()+"')";
    int numberOfRowsAffected=st.executeUpdate(sql);
     if(numberOfRowsAffected>=1){
     return"The data was saved successfully";
     }
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }   
    
return"The data was not saved";
}

///////////////////////////////////////////////

//method to retrieve data from the database

public ResultSet getAllStudents(){

    try{
        //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    String sql="select*from student";
    ResultSet result=st.executeQuery(sql);
    return result;
        
        
    } catch(Exception ex){
        ex.printStackTrace();
        
        
    }
    return null;


}
// to return something a fter updating student in the displayer page

public String updateStudent( Student student){
    
    try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    String sql="update student set student_names='"+student.getStudent_names()+"' where student_id= "+student.getStudent_id()+"";  //!! we never do update on the primary key
    int numberOfRowsAffected=st.executeUpdate(sql);
     if(numberOfRowsAffected>=1){
     return"The data was updated successfully";
     }
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }   
    
return"The data was not updated";
    
    
}

// deleting a student
public String deleteStudent(int student_id){

try{
    //register driver
    DriverManager.registerDriver(new org.postgresql.Driver());
    //create connection
    Connection conn = DriverManager.getConnection(databaseURL,db_username,db_password);
    Statement st=conn.createStatement();
    String sql="delete from student where student_id="+student_id;
    int numberOfRowsAffected=st.executeUpdate(sql);
     if(numberOfRowsAffected>=1){
     return"The data was deleted successfully";
     }
    } catch(Exception ex) {
    
        ex.printStackTrace();
    }    
    
return"The data was not deleted";
    




}



}
