package com.lms.librarymanagment.domain;


import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
@Table
public class  Student extends UsersDomain {

//    @Id
//    @SequenceGenerator(name = "sequence", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//
//    @Column(name = "id", updatable = false)
//    private Long id;

    @Column(name="major")
    private String major;

    @Column(name="programme")
    private String programme;

    @Column(name="registrationStatus")
    private String registrationStatus;

}
