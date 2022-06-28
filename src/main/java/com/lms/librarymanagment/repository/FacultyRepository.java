package com.lms.librarymanagment.repository;

import com.lms.librarymanagment.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
