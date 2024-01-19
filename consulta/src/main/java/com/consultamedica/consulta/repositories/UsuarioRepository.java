package com.consultamedica.consulta.repositories;

import com.consultamedica.consulta.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

    Optional<UsuarioModel> findByUsername(String username);
    boolean existsByEmail(String email);
}
