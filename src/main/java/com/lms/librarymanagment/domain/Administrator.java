package com.lms.librarymanagment.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity(name = "administrator")
@Table
public class Administrator {

    @Id
    @SequenceGenerator(name = "sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="password")
    private String passowrd;

}
