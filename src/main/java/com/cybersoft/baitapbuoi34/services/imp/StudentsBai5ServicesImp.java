package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.dto.CoursesDTO;
import com.cybersoft.baitapbuoi34.dto.StudentCoursesDTO;
import com.cybersoft.baitapbuoi34.dto.StudentsBai5DTO;
import com.cybersoft.baitapbuoi34.entity.StudentsBai5;
import com.cybersoft.baitapbuoi34.repository.StudentBai5Repository;
import com.cybersoft.baitapbuoi34.repository.StudentCourseRepository;
import com.cybersoft.baitapbuoi34.services.StudentsBai5Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsBai5ServicesImp implements StudentsBai5Services {

    @Autowired
    private StudentBai5Repository  studentBai5Repository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;
    @Override
    public boolean addStudentsBai5(StudentsBai5 studentsBai5) {
        studentBai5Repository.save(studentsBai5);
        return true;
    }

    @Override
    public boolean addStudentForCourseById(Integer studentId, Integer courseId) {

        return false;
    }


    @Override
    public List<StudentCoursesDTO> getAllStudentCoursesDtoListById(Integer studentId) {
        return List.of();
    }
}
