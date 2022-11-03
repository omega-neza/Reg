/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author omega
 */
public class Student {
    private int student_id;
    private String student_names;

    public Student() {
    }

    public Student(int student_id, String student_names) {
        this.student_id = student_id;
        this.student_names = student_names;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_names() {
        return student_names;
    }

    public void setStudent_names(String student_names) {
        this.student_names = student_names;
    }
    
    
}
