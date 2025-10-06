package com.cybersoft.baitapbuoi34.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity(name = "studentbai5")
public class StudentsBai5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "studentId")
    private List<StudentCourse>  studentCoursesList;

}
