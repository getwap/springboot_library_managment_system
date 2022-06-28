package com.lms.librarymanagment.controller;


import com.lms.librarymanagment.domain.LoanDomain;
import com.lms.librarymanagment.domain.UsersDomain;
import com.lms.librarymanagment.service.LoanService;
import com.lms.librarymanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private UserService userService;

    @PostMapping("/loan")
    public LoanDomain saveLoan(@RequestBody LoanDomain loanDomain){
        return loanService.saveLoan(loanDomain);

    }

    @GetMapping("/loan")
    public List<LoanDomain> getLoan(){
        return loanService.getLoan();
    }

//    @PutMapping("/{loanId}/users/{usersId}")
//    private LoanDomain loanedUsersToUsers (
//        @PathVariable Long loanId,
//        @PathVariable Long usersId
//    ){
//        LoanDomain loanDomain = loanService.getOne(loanId);
//        UsersDomain usersDomain = userService.getSingleUser(usersId);
//        loanDomain.loanedUsers(usersDomain);
//        return loanService.saveLoan(loanDomain);
//    }

}
