package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.Student;
import com.lms.librarymanagment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getSingleStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
            return studentRepository.getReferenceById(id);
        }
        throw new RuntimeException("there is no student with this id" + id);
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);

    }




}
