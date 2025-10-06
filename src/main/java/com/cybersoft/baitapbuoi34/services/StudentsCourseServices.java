package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.dto.StudentCoursesDTO;
import com.cybersoft.baitapbuoi34.entity.StudentCourse;

import java.util.List;

public interface StudentsCourseServices {

    public boolean registerCourse(Integer studentId, Integer courseId);
    public List<StudentCoursesDTO> getStudentCourses(int studentId);
}
