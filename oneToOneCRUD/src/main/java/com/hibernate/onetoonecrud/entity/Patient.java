package com.hibernate.onetoonecrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
    public Patient(){

    }

    public Patient(String name, String address, byte age, Double totalLabCost, PatientDetails patientDetails) {
        this.name = name;
        Address = address;
        this.age = age;
        this.totalLabCost = totalLabCost;
        this.patientDetails = patientDetails;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private PatientDetails patientDetails;

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

    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(PatientDetails patientDetails) {
        this.patientDetails = patientDetails;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                ", totalLabCost=" + totalLabCost +
                ", patientDetails=" + patientDetails +
                '}';
    }
}
