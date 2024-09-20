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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String telefono;
    private int edad;
    private String fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;
    @ManyToOne
    @JoinColumn(name = "id_estado_persona")
    private EstadoPersona estadoPersona;
    @ManyToOne
    @JoinColumn(name="id_sucursal")
    private Sucursal sucursal;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private List<DireccionPersona> direccionPersonas;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private List<Coleccionista> collecionista;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private List<Empleado> empleado;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private List<ContactoPersona> contactoPersonas;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private List<HistorialPropiedad> historialPropiedades;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private List<Transaccion> transaccion;



}
