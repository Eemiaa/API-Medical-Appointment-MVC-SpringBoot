package com.consultamedica.consulta.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "medico")
@Getter
@Setter
public class MedicoModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 45)
    private String nome;

    @Column(nullable = false, length = 8)
    private String cep;

    @Column(nullable = false, length = 13)
    private String telefone;

    @Column(nullable = false, length = 45, unique = true)
    private String crm;

    //one to one
    //@OneToOne(mappedBy = "usuario")
    //@MapsId
    //@JoinColumn(name = "user_id")
    //private UsuarioModel usuario;

    //one_to_many
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private Set<ConsultaModel> consultas;
}
