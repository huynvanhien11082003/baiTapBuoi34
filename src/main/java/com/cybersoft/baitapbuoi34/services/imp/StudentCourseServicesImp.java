package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.dto.CoursesDTO;
import com.cybersoft.baitapbuoi34.dto.StudentCoursesDTO;
import com.cybersoft.baitapbuoi34.dto.StudentsBai5DTO;
import com.cybersoft.baitapbuoi34.entity.Courses;
import com.cybersoft.baitapbuoi34.entity.StudentCourse;
import com.cybersoft.baitapbuoi34.entity.StudentsBai5;
import com.cybersoft.baitapbuoi34.repository.CoursesRepository;
import com.cybersoft.baitapbuoi34.repository.StudentBai5Repository;
import com.cybersoft.baitapbuoi34.repository.StudentCourseRepository;
import com.cybersoft.baitapbuoi34.services.StudentsCourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentCourseServicesImp implements StudentsCourseServices {
    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Autowired
    private StudentBai5Repository studentBai5Repository;

    @Autowired
    private CoursesRepository  coursesRepository;

    @Override
    public boolean registerCourse(Integer studentId, Integer courseId) {
        Optional<StudentsBai5>studentsBai5 = studentBai5Repository.findById(studentId);
        Optional<Courses>courses = coursesRepository.findById(courseId);

        if(studentsBai5.isPresent() && courses.isPresent()){
            StudentsBai5 studentsBai5New = studentsBai5.get();
            Courses coursesNew = courses.get();
            StudentCourse  studentCourseNew = new StudentCourse();
            studentCourseNew.setStudentId(studentsBai5New);
            studentCourseNew.setCourseId(coursesNew);
            studentCourseRepository.save(studentCourseNew);
            return true;
        }
        return false;
    }

    @Override
    public List<StudentCoursesDTO> getStudentCourses(int studentId) {
        List<StudentCourse> studentCourseList = studentCourseRepository.findByStudentId_Id(studentId);

        return studentCourseList.stream().map(item ->{
            StudentCoursesDTO studentCoursesDTO = new StudentCoursesDTO();
            studentCoursesDTO.setId(item.getId());

            StudentsBai5DTO studentsBai5DTO = new StudentsBai5DTO();
            studentsBai5DTO.setStudentId(item.getStudentId().getId());
            studentsBai5DTO.setName(item.getStudentId().getName());
            studentCoursesDTO.setStudentsBai5DTO(studentsBai5DTO);

            CoursesDTO coursesDTO = new CoursesDTO();
            coursesDTO.setCourseId(item.getCourseId().getId());
            coursesDTO.setTitle(item.getCourseId().getTitle());
            studentCoursesDTO.setCoursesDTO(coursesDTO);

            return studentCoursesDTO;

        }).toList();
    }
}
