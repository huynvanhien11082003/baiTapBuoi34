package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Student;
import com.cybersoft.baitapbuoi34.repository.StudentRepository;
import com.cybersoft.baitapbuoi34.request.InsertStudentRequest;
import com.cybersoft.baitapbuoi34.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImp implements StudentServices {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public boolean insertStudents(InsertStudentRequest insertStudentRequest) {
        Student student = new Student();
        student.setName(insertStudentRequest.getName());
        student.setEmail(insertStudentRequest.getEmail());
        Student studentInsert = studentRepository.save(student);
        if (studentInsert != null) {
            return true;
        }
        return false;
    }
}
