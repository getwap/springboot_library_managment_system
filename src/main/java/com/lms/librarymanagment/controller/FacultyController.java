package com.lms.librarymanagment.controller;


import com.lms.librarymanagment.domain.Faculty;
import com.lms.librarymanagment.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class FacultyController {

    @Autowired
    FacultyService facultyService;

    @PostMapping("/faculty")
    private Faculty saveFaculty(@RequestBody Faculty faculty){
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/faculty")
    private List<Faculty> getFaculty (){
        return facultyService.getFaculty();
    }
    @GetMapping("/faculty/{id}")
    private Faculty getSingleFaculty (@PathVariable Long id){
        return facultyService.getSingleFaculty(id);
    }
    @PutMapping("/faculty/{id}")
    private Faculty updateFaculty (@RequestBody Faculty faculty, @PathVariable Long id){
        faculty.setId(id);
        return facultyService.updateFaculty(faculty);
    }
    @DeleteMapping("/faculty")
    private void deleteFaculty(@RequestParam Long id){
        facultyService.deleteFaculty(id);
    }

}
