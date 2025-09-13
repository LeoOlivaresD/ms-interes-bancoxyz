package com.duoc.ms_interes_bancoxyz.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DtoInteres {
    private String idCuenta;
    private String nombreCliente;
    private Integer saldo;
    private Integer edadCliente;
    private String tipoInteres;
    private LocalDateTime horaCalculo;

}