package com.consultamedica.consulta.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "consulta")
@Getter
@Setter
public class ConsultaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private Date data;

    //many to one
    @ManyToOne
    @JoinColumn(name = "medico_id",  insertable = false, updatable = false)
    private MedicoModel medico;
    //many to one
    @ManyToOne
    @JoinColumn(name = "paciente_id",  insertable = false, updatable = false)
    private PacienteModel paciente;
    //many to one
    @ManyToOne
    @JoinColumn(name = "secretaria_id",  insertable = false, updatable = false)
    private SecretariaModel secretaria;

    @Column(nullable = false, length = 10, precision = 2)
    private float valor;

    @Column(nullable = false)
    private boolean pago;
}
