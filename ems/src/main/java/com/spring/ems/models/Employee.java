package com.spring.ems.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "employee_table")
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @Column(name = "emp_id")
    private  Long id;
    @Column(nullable = false,name = "enp_name")
    private String name;
    @Column(nullable = false,name = "enp_gender")
    private  String gender;
    @Column(nullable = false,name = "enp_age")
    private int age;
    @Column(nullable = false,name = "enp_designation")
    private  String designation;
    @Column(nullable = false,name = "enp_department")
    private String department;
    @Column(nullable = false,name = "enp_salary")
    private double salary;
    @Column(nullable = false,name = "enp_username",unique = true)
    private String username;
    @Column(nullable = false,name = "enp_email",unique = true)
    private String email;
    @Column(nullable = false,name = "enp_password")
    private String password;
    @Column(nullable = false,name = "enp_contact")
    private String contact;


    @ToString.Exclude
    @OneToMany(mappedBy = "emp", cascade = CascadeType.ALL)
    private List<Leaves> leavesList;
    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Duty> duties;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;


}
