package com.lms.librarymanagment.repository;


import com.lms.librarymanagment.domain.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long> {
}
