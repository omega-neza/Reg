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
public class Lecturer {
    private int lecture_id;
    private String lecturer_names;

    public Lecturer() {
    }

    public Lecturer(int lecture_id, String lecturer_names) {
        this.lecture_id = lecture_id;
        this.lecturer_names = lecturer_names;
    }

    public int getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(int lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getLecturer_names() {
        return lecturer_names;
    }

    public void setLecturer_names(String lecturer_names) {
        this.lecturer_names = lecturer_names;
    }
    
    
    
}
