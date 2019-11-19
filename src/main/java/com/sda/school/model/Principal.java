package com.sda.school.model;

import javax.persistence.*;

@Entity
@Table (name = "principal")
public class Principal extends EntityBase{

    @OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "principal_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
