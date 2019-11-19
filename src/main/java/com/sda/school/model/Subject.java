package com.sda.school.model;

import javax.persistence.*;


@Entity(name = "Subject")
@Table(name = "subject")
public class Subject extends EntityBase {

    @Column (name = "subject_name", nullable = false)
    private String subjectName;

    @OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "teacher_id")
    private Teacher teacher;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
