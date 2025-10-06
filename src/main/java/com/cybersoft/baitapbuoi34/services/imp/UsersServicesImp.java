package com.cybersoft.baitapbuoi34.services.imp;

import com.cybersoft.baitapbuoi34.entity.Users;
import com.cybersoft.baitapbuoi34.repository.UsersRepository;
import com.cybersoft.baitapbuoi34.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServicesImp implements UsersServices {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users createUsers(Users users) {
        return usersRepository.save(users);
    }
}
