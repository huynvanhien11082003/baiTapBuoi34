package com.cybersoft.baitapbuoi34.repository;

import com.cybersoft.baitapbuoi34.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,Integer> {
    List<StudentCourse> findByStudentId_Id(int studentId);
}
