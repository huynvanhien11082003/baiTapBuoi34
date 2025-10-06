package com.cybersoft.baitapbuoi34.services;

import com.cybersoft.baitapbuoi34.entity.Student;
import com.cybersoft.baitapbuoi34.request.InsertStudentRequest;

import java.util.List;

public interface StudentServices {
    List<Student> findAll();
    public boolean insertStudents(InsertStudentRequest insertStudentRequest);
}
