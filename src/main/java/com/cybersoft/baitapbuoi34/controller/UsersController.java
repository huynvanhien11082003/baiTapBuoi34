package com.cybersoft.baitapbuoi34.controller;

import com.cybersoft.baitapbuoi34.entity.Users;
import com.cybersoft.baitapbuoi34.services.imp.UsersServicesImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersServicesImp usersServices;

    @PostMapping()
    public ResponseEntity<?> createUsers(@Valid @RequestBody Users users){
        usersServices.createUsers(users);
        return ResponseEntity.ok("Thêm User thành công");
    }
}
