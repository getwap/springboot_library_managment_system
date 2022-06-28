package com.lms.librarymanagment.service;


import com.lms.librarymanagment.domain.Faculty;
import com.lms.librarymanagment.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {


    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public List<Faculty> getFaculty() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty saveFaculty(Faculty faculty) {

        return facultyRepository.save(faculty);
    }
    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty getSingleFaculty(Long id) {
        Optional<Faculty> faculty = facultyRepository.findById(id);
        if(faculty.isPresent()) {
            return facultyRepository.getReferenceById(id);
        }throw new RuntimeException("cant find users");
    }

    @Override
    public void deleteFaculty(Long id) {
            facultyRepository.deleteById(id);
    }


}
