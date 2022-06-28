package com.lms.librarymanagment.service;


import com.lms.librarymanagment.domain.Book;
import com.lms.librarymanagment.domain.Reserve;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReserveService {

    //save reserve
    Reserve saveReserve(Reserve reserve);
    //list reserve
    List<Reserve> ListReserve(Reserve reserve);
    //get single reserve
    Reserve getSingleReserve(Long id);
    //update reserve
    Reserve updateReserve(Reserve reserve);
    //delete reserve
    void deleteReserve(Long id);
}
