package com.sda.school.model;

import javax.persistence.*;


@Entity(name = "Subject")
@Table(name = "subject")
public class Subject extends EntityBase {

    @Column (name = "subject_name", nullable = false)
    private String subjectName;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


}
