package com.lms.librarymanagment.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Data
@Builder
@Entity(name = "loan")
@AllArgsConstructor
@NoArgsConstructor
public class LoanDomain {

    @Id
    @SequenceGenerator(
        name = "sequence", allocationSize = 1
    )
    @GeneratedValue(strategy = SEQUENCE,generator = "loan_sequence")
    @Column(name="id", updatable = false)
    private Long id;

//    public Set<UsersDomain> getLoanedUsers() {
//        return loanedUsers;
//    }

//    @ManyToMany
//    @JoinTable(
//        name = "user_loaned",
//        joinColumns = @JoinColumn(name = "loan_id"),
//        inverseJoinColumns = @JoinColumn(name = "user_id")
//    )
//
//    private Set<UsersDomain> loanedUsers = new HashSet<>();

    @Column(name="loanDate")
    private LocalDate loanDate;

    @Column(name="renewDate")
    private LocalDate renewDate;

    @Column(name="duedate")
    private LocalDate dueDate;

    @Column(name="returnDate")
    private LocalDate returnDate;

    @Column(name="renewedTimes")
    private Long renewedTimes;

    @Column(name="isReturned")
    private Boolean isReturned;

    @Column(name="overDueFee")
    private Long overDueFee;

    @Column(name="overDue3Days")
    private Boolean overDue3Days;

    @Column(name="overDue10Days")
    private Boolean overDue10Days;

    @Column(name="overDue17Days")
    private Boolean overDue17Days;

    @Column(name="overDue31Days")
    private Boolean overDue31Days;

//
//    public void loanedUsers(UsersDomain usersDomain) {
//        loanedUsers.add(usersDomain);
//
//    }
}
