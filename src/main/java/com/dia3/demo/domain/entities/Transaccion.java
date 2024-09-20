package com.dia3.demo.domain.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_tipo_transaccion")
    private TipoTransaccion tipoTransaccion;

    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name="id_estacion_pago")
    private EstacionPago estacionPago;

    private float valor;
    private String fechaventa;

    @OneToMany(mappedBy = "transaccion")
    @JsonIgnore
    private List<Despacho>despacho;
    

}
