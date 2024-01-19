package com.consultamedica.consulta.repositories;

import com.consultamedica.consulta.models.SecretariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SecretariaRepository extends JpaRepository<SecretariaModel, UUID> {
    boolean existsByCpf(String cpf);
}
