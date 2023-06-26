package me.zakariae.essaiydy.Microservicesproject.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "tbl_employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String firstName;
    @Column
    private String lastName;

    @Column
    private String emailId;

    @Column
    private String department;



}
