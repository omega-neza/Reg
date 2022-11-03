/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;

/**
 *
 * @author omega
 */
public class Discipline {
    private String reason;
    private int student_id_fk;
    private Date recordDate;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStudent_id_fk() {
        return student_id_fk;
    }

    public void setStudent_id_fk(int student_id_fk) {
        this.student_id_fk = student_id_fk;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Discipline() {
    }

    public Discipline(String reason, int student_id_fk, Date recordDate) {
        this.reason = reason;
        this.student_id_fk = student_id_fk;
        this.recordDate = recordDate;
    }
    
    
    
}
