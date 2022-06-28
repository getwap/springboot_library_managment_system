package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.LoanDomain;

import java.util.List;

public interface LoanService {

    List<LoanDomain> getLoan();
    //save loan
    LoanDomain saveLoan(LoanDomain loanDomain);

    LoanDomain getOne(Long id);

}
