package com.spring.ems.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "duty_table")
@Getter
@Setter
@ToString
public class Duty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "assignedByManager")
    private Manager assignedByManager;

    @ManyToOne
    @JoinColumn(name = "assignedByAdmin")
    private Admin assignedByAdmin;
}