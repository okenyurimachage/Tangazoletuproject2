package com.project.CasualLabourerDetails.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Labourer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String worktagcode;
    private String name;
    private String phonenumber;
    private String email;

    public Labourer(){

    }

    public Labourer(String worktagcode, String name, String phonenumber, String email) {
        this.worktagcode = worktagcode;
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }


    public Labourer(Long id, String worktagcode, String name, String phonenumber, String email) {
        this.id = id;
        this.worktagcode = worktagcode;
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorktagcode() {
        return worktagcode;
    }

    public void setWorktagcode(String worktagcode) {
        this.worktagcode = worktagcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Labourer{" +
                "id=" + id +
                ", worktagcode='" + worktagcode + '\'' +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';


}
    }