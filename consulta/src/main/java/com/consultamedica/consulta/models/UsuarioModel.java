package com.consultamedica.consulta.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioModel implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 45)
    private String username;

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    //One to one
    //@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    //private UsuarioModel usuario;

    //One to one
    //@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    //private PacienteModel pacienteModel;

    //One to one
    //@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    //private SecretariaModel secretariaModel;
}
