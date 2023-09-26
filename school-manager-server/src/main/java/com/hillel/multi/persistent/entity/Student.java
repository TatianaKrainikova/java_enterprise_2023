package com.hillel.multi.persistent.entity;

import com.hillel.multi.service.validation.annotation.PhoneNumberConstraint;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.Set;

@Validated
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

    @PhoneNumberConstraint
    @Column(name = "student_phone")
    private String phone;

    @Email
    @Column(name = "student_email")
    private String email;

    @ManyToMany(mappedBy = "students")
    private Set<Group> groups;

}
