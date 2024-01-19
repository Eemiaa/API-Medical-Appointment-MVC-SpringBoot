package com.consultamedica.consulta.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "secretaria")
@Getter
@Setter
public class SecretariaModel {
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

    //one to one
    //@OneToOne(mappedBy = "usuario")
    //@MapsId
    //@JoinColumn(name = "user_id")
    //private UsuarioModel usuario;

    //one_to_many
    @OneToMany(mappedBy = "secretaria", cascade = CascadeType.ALL)
    private Set<ConsultaModel> consultas;
}
