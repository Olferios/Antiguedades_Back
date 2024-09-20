package com.dia3.demo.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MovCaja {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_estacion_pago")
    private EstacionPago estacionPago;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_tipo_mov_caja")
    private TipoMovCaja tipoMovCaja;



}
