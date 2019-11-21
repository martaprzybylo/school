package com.sda.school.model;

import javax.persistence.*;
@Table (name = "class")
@Entity (name = "Class")
public class Class extends EntityBase {

    @Column(name ="class_name")
    private String className;

@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
@JoinColumn(name= "host_id")
private Teacher teacher;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
