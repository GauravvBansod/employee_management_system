package com.spring.ems.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;

@Entity
@Table(name = "leaves_table")
@Getter
@Setter
@ToString
public class Leaves {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @Column(nullable = false)
    private String reason;
    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee emp;

}
