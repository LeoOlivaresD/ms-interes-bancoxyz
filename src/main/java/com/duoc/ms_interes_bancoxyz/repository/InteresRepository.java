package com.duoc.ms_interes_bancoxyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.ms_interes_bancoxyz.entity.Interes;

@Repository
public interface InteresRepository extends JpaRepository<Interes, Long> {

}
