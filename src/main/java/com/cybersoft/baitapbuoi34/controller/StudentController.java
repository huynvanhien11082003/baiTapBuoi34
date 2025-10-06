package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.request.InsertStudentRequest;
import com.cybersoft.baitapbuoi34.respone.BaseResponse;
import com.cybersoft.baitapbuoi34.services.imp.StudentServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServicesImp studentServicesImp;

    @GetMapping
    public ResponseEntity<?> getStudents() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(HttpStatus.OK.value());
        baseResponse.setData(studentServicesImp.findAll());
        return  ResponseEntity.ok(baseResponse);
    }

    @PostMapping
    public ResponseEntity<?> insertStudents(@RequestBody InsertStudentRequest insertStudentRequest) {
        studentServicesImp.insertStudents(insertStudentRequest);
        return ResponseEntity.ok("Insert Thành Công");
    }

}
