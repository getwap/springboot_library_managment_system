package com.lms.librarymanagment.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity(name = "bookCopy")
@Table
public class BookCopy {

    @Id
    @SequenceGenerator(name = "sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "barCode")
    private String barCode;
    @Column(name = "status")
    private String status;
    @Column (name = "location")
    private String location;
    @Column (name= "isReserved")
    private Boolean isReserved;

}
