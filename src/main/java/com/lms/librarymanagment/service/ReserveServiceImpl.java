package com.lms.librarymanagment.service;


import com.lms.librarymanagment.domain.Reserve;
import com.lms.librarymanagment.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReserveServiceImpl implements ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;

    @Override
    public Reserve saveReserve(Reserve reserve){
        return reserveRepository.save(reserve);
    }

    @Override
    public List<Reserve> ListReserve(Reserve reserve) {

        return reserveRepository.findAll();
    }

    @Override
    public Reserve getSingleReserve(Long id) {
        Optional<Reserve> reserve = reserveRepository.findById(id);
        if(reserve.isPresent()){
        return reserveRepository.getReferenceById(id);}
        throw new RuntimeException("can't find Reserve" + id);
    }

    @Override
    public Reserve updateReserve(Reserve reserve) {
        return reserveRepository.save(reserve);
    }

    @Override
     public void deleteReserve(Long id) {
        reserveRepository.deleteById(id);

    }


}
