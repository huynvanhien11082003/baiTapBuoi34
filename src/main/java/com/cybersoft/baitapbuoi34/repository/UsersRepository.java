package com.cybersoft.baitapbuoi34.repository;

import com.cybersoft.baitapbuoi34.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Integer> {
}
