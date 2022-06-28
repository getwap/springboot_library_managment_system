package com.lms.librarymanagment.controller;


import com.fasterxml.jackson.core.JsonEncoding;
import com.lms.librarymanagment.domain.Reserve;
import com.lms.librarymanagment.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v6")
public class ResreveController {

    @Autowired
    private ReserveService reserveService;

    @PostMapping("/resreve")
    public Reserve saveReserve (@RequestBody Reserve reserve){
        return reserveService.saveReserve(reserve);
    }
    @GetMapping("/reserve")
    public List<Reserve> ListReserve(@RequestBody Reserve reserve) {
        return reserveService.ListReserve(reserve);

        }

    @GetMapping("/reserve/{id}")
    public Reserve getSingleReserve(@PathVariable Long id){
        return reserveService.getSingleReserve(id);
    }
    @DeleteMapping("/reserve")
    public void deleteReserve(@RequestParam Long id){
        reserveService.deleteReserve(id);

    }
    @PutMapping("/reserve/{id}")
    public Reserve UpdateReserve(@RequestBody Reserve reserve, @PathVariable Long id){
        reserve.setId(id);
        return reserveService.updateReserve(reserve);

    }
}
