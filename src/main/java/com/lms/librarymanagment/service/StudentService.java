package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudent();
    Student saveStudent(Student student);
    void deleteStudent(Long id);

    Student getSingleStudent(Long id);

    Student updateStudent(Student student);
}
