package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.Faculty;
import com.lms.librarymanagment.domain.UsersDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacultyService  {

    //list all users
    List<Faculty> getFaculty();
    //update user
    Faculty updateFaculty(Faculty faculty);
    //persist users in the database
    Faculty saveFaculty (Faculty faculty);
    //get single user from database
    Faculty getSingleFaculty(Long id);
    //delete single user
    void deleteFaculty(Long id);

}


