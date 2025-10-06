package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Courses;
import com.cybersoft.baitapbuoi34.repository.CoursesRepository;
import com.cybersoft.baitapbuoi34.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServicesImp implements CourseServices {

    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public boolean addCourse(Courses courses) {
        coursesRepository.save(courses);
        return true;
    }
}
