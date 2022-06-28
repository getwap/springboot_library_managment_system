package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.LoanDomain;
import com.lms.librarymanagment.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;


    @Override
    public LoanDomain saveLoan (LoanDomain loanDomain){
        return loanRepository.save(loanDomain);
    }
    @Override
    public List<LoanDomain> getLoan(){
        return loanRepository.findAll();
    }
    @Override
    public LoanDomain getOne(Long id){
        return loanRepository.getReferenceById(id);
    }

}
