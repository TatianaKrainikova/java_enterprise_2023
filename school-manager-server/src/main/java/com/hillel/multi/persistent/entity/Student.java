package com.hillel.multi.persistent.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private Integer id;

    @NotNull
    @Column(name = "student_name")
    private String name;

    @Column(name = "student_phone")
    private String phone;

    @Email
    @Column(name = "student_email")
    private String email;

    @ManyToMany(mappedBy = "students")
    private Set<Group> groups;

}
