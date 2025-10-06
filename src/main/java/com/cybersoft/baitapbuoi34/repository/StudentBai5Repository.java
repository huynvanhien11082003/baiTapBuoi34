package com.cybersoft.baitapbuoi34.repository;

import com.cybersoft.baitapbuoi34.entity.StudentsBai5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentBai5Repository extends JpaRepository<StudentsBai5, Integer> {
}
