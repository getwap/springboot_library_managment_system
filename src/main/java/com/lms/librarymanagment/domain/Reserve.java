package com.lms.librarymanagment.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity(name = "reserve")
@Table
public class Reserve {

    @Id
    @SequenceGenerator(name = "sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "reservedate")
    private LocalDate reserveDate;
    @Column(name= "isReservedColsed")
    private Boolean isReservedClosed;


}
