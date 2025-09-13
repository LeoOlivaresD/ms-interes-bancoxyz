package com.duoc.ms_interes_bancoxyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.ms_interes_bancoxyz.dtos.DtoInteres;
import com.duoc.ms_interes_bancoxyz.service.InteresService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("banco/api")
public class InteresRestController {
    @Autowired
    private InteresService interesService;

    public InteresRestController(InteresService interesService) {
        this.interesService = interesService;
    }

    @GetMapping("/intereses")
    public ResponseEntity<List<DtoInteres>> getAllInterests() {
        return ResponseEntity.ok(interesService.findAllInterests());

    }
}
