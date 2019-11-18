package com.sda.school.model;

import javax.persistence.*;
import java.util.Date;

@Table (name = "person")
@Entity (name = "Person")
public class Person extends EntityBase{

    @Column (name = "first_name", updatable = true)
    private String firstName;

    @Column (name = "last_name", updatable = true)
    private String lastName;

    @Column (name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column (name = "birth_date", updatable = true)
    private Date birthDate;

    @Column (name = "email", updatable = true)
    private String email;

    @Column (name = "tel_number", updatable = true)
    private Integer telNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(Integer telNumber) {
        this.telNumber = telNumber;
    }


}
