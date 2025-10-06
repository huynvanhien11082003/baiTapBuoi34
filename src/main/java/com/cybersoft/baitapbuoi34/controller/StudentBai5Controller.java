package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.dto.CoursesDTO;
import com.cybersoft.baitapbuoi34.dto.StudentCoursesDTO;
import com.cybersoft.baitapbuoi34.entity.Courses;
import com.cybersoft.baitapbuoi34.entity.StudentCourse;
import com.cybersoft.baitapbuoi34.entity.StudentsBai5;
import com.cybersoft.baitapbuoi34.services.StudentsCourseServices;
import com.cybersoft.baitapbuoi34.services.imp.StudentCourseServicesImp;
import com.cybersoft.baitapbuoi34.services.imp.StudentsBai5ServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentsbai5")
public class StudentBai5Controller {

    @Autowired
    private StudentsBai5ServicesImp studentBai5ServicesImp;

    @Autowired
    private StudentCourseServicesImp studentCourseServicesImp;

    @PostMapping
    public ResponseEntity<?> addStudentsBai5(@RequestBody StudentsBai5 studentsBai5) {
        studentBai5ServicesImp.addStudentsBai5(studentsBai5);
        return ResponseEntity.ok("Thêm sinh viên ở bài 5 thành công");
    }
    @PostMapping("{id}/courses/{courseId}")
    public ResponseEntity<?> addCoursesForStudent(@PathVariable Integer id, @PathVariable Integer courseId){
        studentCourseServicesImp.registerCourse(id, courseId);
        return  ResponseEntity.ok("Đăng kí khóa học cho sinh viên thành công");
    }
    @GetMapping("{id}/courses")
    public ResponseEntity<?> getCoursesForStudent(@PathVariable int id){
        List<StudentCoursesDTO> studentCoursesDTOList =  studentCourseServicesImp.getStudentCourses(id);
        return ResponseEntity.ok(studentCoursesDTOList);
    }

}
