package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.dto.CoursesDTO;
import com.cybersoft.baitapbuoi34.dto.StudentCoursesDTO;
import com.cybersoft.baitapbuoi34.entity.StudentsBai5;

import java.util.List;

public interface StudentsBai5Services {
    public boolean addStudentsBai5(StudentsBai5 studentsBai5);
    public boolean addStudentForCourseById(Integer studentId, Integer courseId);
    List<StudentCoursesDTO> getAllStudentCoursesDtoListById(Integer studentId);
}
