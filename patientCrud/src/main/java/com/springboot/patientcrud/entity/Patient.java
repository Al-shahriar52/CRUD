package com.springboot.patientcrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient_crud")
public class Patient {

    public Patient(){

    }

    public Patient( String name, String city, byte age, Double totalLabCost) {

        this.name = name;
        this.city = city;
        this.age = age;
        this.totalLabCost = totalLabCost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "age",nullable = false)
    private byte age;

    @Column(name = "total_lab_cost",nullable = false)
    private Double totalLabCost;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", totalLabCost=" + totalLabCost +
                '}';
    }
}
