package com.lms.librarymanagment;

import com.lms.librarymanagment.domain.LoanDomain;
import com.lms.librarymanagment.repository.LoanRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LoanRepositoryTest {

    @Autowired
    private LoanRepository loanRepository;

    @Test
    public void saveLoanTest(){
        LoanDomain loanDomain = LoanDomain.builder()
            .loanDate(LocalDate.ofEpochDay(2022-06-27))
            .dueDate(LocalDate.ofEpochDay(2022-07-10))
            .isReturned(false)
            .overDue3Days(false)
            .overDue10Days(false)
            .overDue17Days(false)
            .overDueFee(Long.valueOf(0))
            .renewedTimes(Long.valueOf(0

            ))
            .returnDate(LocalDate.ofEpochDay(2022-07-10))
            .renewDate(LocalDate.ofEpochDay(2022-07-05))
            .overDue31Days(false)
            .build();

        loanRepository.save(loanDomain);
        Assertions.assertThat(loanDomain.getId()).isGreaterThan(0);

    }
    @Test
    public void getLoanTest(){
        LoanDomain loanDomain = loanRepository.findById(1L).get();
        Assertions.assertThat(loanDomain.getId()).isEqualTo(1L);
    }

    @Test
    public void getListofLoanTest(){
        List<LoanDomain> loanDomainList = loanRepository.findAll();
        Assertions.assertThat(loanDomainList.size()).isGreaterThan(0);
    }

    @Test
    public void updateLoanTest(){
        LoanDomain loanDomain = loanRepository.findById(1L).get();
        loanDomain.setIsReturned(true);
        LoanDomain loanDomain1 = loanRepository.save(loanDomain);
        Assertions.assertThat(loanDomain1.getIsReturned()).isEqualTo(true);
    }

    @Test
    public void deleteLoanTest(){
        LoanDomain loanDomain = loanRepository.findById(1L).get();

        loanRepository.delete(loanDomain);
        LoanDomain loanDomain1 = null;
        Optional<LoanDomain> optionalLoanDomain = loanRepository.findById(1L);
        if (optionalLoanDomain.isPresent()){
            loanDomain1 = optionalLoanDomain.get();
        }

        Assertions.assertThat(loanDomain1).isNull();
    }
}
