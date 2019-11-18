package com.sda.school.model;

import javax.persistence.*;

@Entity (name = "Grade")
@Table(name = "grade")
public class Grade extends EntityBase {

    @Column (name = "value")
    private Integer value;

    @ManyToOne (optional = false)
    @JoinColumn (name = "student_id", nullable = false)
    private Student student;

    @ManyToOne (optional = false)
    @JoinColumn (name = "subject_id", nullable = false)
    private Subject subject;

    public Grade() {
    }

    public Grade(Integer value, Student student) {
        this.value = value;
        this.student = student;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
