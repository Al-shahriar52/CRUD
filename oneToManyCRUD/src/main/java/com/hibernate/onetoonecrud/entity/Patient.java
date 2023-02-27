package com.hibernate.onetoonecrud.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {
    public Patient(){

    }

    public Patient(String name, String address, byte age, Double totalLabCost) {
        this.name = name;
        Address = address;
        this.age = age;
        this.totalLabCost = totalLabCost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "address")
    private String Address;

    @Column(name = "age")
    private byte age;

    @Column(name = "totalcost")
    private Double totalLabCost;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List < PatientDetails > details = new ArrayList< >();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Double getTotalLabCost() {
        return totalLabCost;
    }

    public void setTotalLabCost(Double totalLabCost) {
        this.totalLabCost = totalLabCost;
    }

    public List<PatientDetails> getDetails() {
        return details;
    }

    public void setDetails(List<PatientDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                ", totalLabCost=" + totalLabCost +
                ", details=" + details +
                '}';
    }
}
