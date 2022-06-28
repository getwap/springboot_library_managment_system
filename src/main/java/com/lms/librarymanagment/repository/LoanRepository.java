package com.lms.librarymanagment.repository;


import com.lms.librarymanagment.domain.LoanDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<LoanDomain, Long> {
}
