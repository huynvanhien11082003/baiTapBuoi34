package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.entity.Courses;
import com.cybersoft.baitapbuoi34.services.imp.CourseServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CourseServicesImp courseServicesImp;

    @PostMapping
    public ResponseEntity<?> addCourses(@RequestBody Courses courses){
        courseServicesImp.addCourse(courses);
        return ResponseEntity.ok("Thêm Courses thành công");
    }

}
