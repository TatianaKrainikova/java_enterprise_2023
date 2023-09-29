package com.hillel.multi.persistent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "course")
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "course_id")
    private Integer id;

    @NotNull
    @Column(name = "course_name")
    private String name;

    @Column(name = "course_cost")
    private Integer cost;

}
