package com.spring.ems.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

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
    @Column(nullable = false,length = 500)
    private String description;

    @ManyToAny
    @JoinColumn(name = "emp_id")
    private Employee employee;
    @ManyToAny
    @JoinColumn(name = "assignedByManager")
    private Manager assignedByManager;
    @ManyToAny
    @JoinColumn(name = "assignedByAdmin")
    private Admin assignedByAdmin;

}
