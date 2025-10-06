package com.cybersoft.baitapbuoi34.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "studentcourse")
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "studentid")
    private StudentsBai5 studentId;

    @ManyToOne
    @JoinColumn(name = "courseid")
    private Courses courseId;


}
