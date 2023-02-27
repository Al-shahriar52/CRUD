package com.springboot.crudoperation.Repository;

import com.springboot.crudoperation.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByDepartment(String department);
}
