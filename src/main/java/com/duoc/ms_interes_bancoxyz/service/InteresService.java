package com.duoc.ms_interes_bancoxyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.ms_interes_bancoxyz.dtos.DtoInteres;
import com.duoc.ms_interes_bancoxyz.repository.InteresRepository;

@Service
public class InteresService {
    @Autowired
    private InteresRepository interesRepository;

    public InteresService(InteresRepository interesRepository) {
        this.interesRepository = interesRepository;
    }

    public List<DtoInteres> findAllInterests() {
        return interesRepository.findAll().stream()
                .map(interes -> new DtoInteres(
                        interes.getIdCuenta(),
                        interes.getNombreCliente(),
                        interes.getSaldo(),
                        interes.getEdadCliente(),
                        interes.getTipoInteres()))
                .toList();

    }

}
