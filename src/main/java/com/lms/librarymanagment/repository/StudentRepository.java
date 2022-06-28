package com.lms.librarymanagment.repository;

import com.lms.librarymanagment.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
