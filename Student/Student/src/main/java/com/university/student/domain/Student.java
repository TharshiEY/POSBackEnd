package com.university.student.domain;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
@SQLDelete(sql = "Update student set status = true where id = ?")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "status")
    private Boolean status;
}
