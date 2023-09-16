package com.hillel.multi.persistent.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity(name = "teacher")
@Table(name = "teachers")
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    private Integer id;

    @NotNull
    @Column(name = "teacher_name")
    private String name;

    @Column(name = "teacher_phone")
    private String phone;

    @Column(name = "teacher_email")
    private String email;

    @OneToMany(mappedBy = "teacher")
    private Set<Group> groups;
}
