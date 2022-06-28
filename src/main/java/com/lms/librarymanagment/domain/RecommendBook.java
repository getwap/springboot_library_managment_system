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
@Entity(name = "recommend_book")
@Table
public class RecommendBook {

    @Id
    @SequenceGenerator(name = "sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "recommenddate")
    private LocalDate recommendDate;

}
