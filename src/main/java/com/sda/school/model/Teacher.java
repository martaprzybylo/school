package com.sda.school.model;

import javax.persistence.*;

@Entity (name = "Teacher")
@Table (name = "teacher")
public class Teacher extends EntityBase{

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "teacher_id")
    private Person person;

    @OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "subject_id")
    private Subject subject;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
