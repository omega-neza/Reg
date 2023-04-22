/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

package model;

/**
 *
 * 
 */
public class Course {
    private String course_id;
    private String course_name;
    private  int lecturer_id_fk;
    private  int student_id_fk;

    public Course() {
    }

    public Course(String course_id, String course_name, int lecturer_id_fk, int student_id_fk) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.lecturer_id_fk = lecturer_id_fk;
        this.student_id_fk = student_id_fk;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getLecturer_id_fk() {
        return lecturer_id_fk;
    }

    public void setLecturer_id_fk(int lecturer_id_fk) {
        this.lecturer_id_fk = lecturer_id_fk;
    }

    public int getStudent_id_fk() {
        return student_id_fk;
    }

    public void setStudent_id_fk(int student_id_fk) {
        this.student_id_fk = student_id_fk;
    }

   
}
