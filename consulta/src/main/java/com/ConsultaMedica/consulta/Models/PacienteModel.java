package com.ConsultaMedica.consulta.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "PACIENTE")
@Getter
@Setter
public class PacienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 45)
    private String nome;

    @Column(nullable = false, length = 8)
    private String cep;

    @Column(nullable = false, length = 13)
    private String telefone;

    @Column(nullable = false, length = 11, unique = true)
    private String cpf;

    //one_to_many
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private Set<ConsultaModel> consultas;
}
