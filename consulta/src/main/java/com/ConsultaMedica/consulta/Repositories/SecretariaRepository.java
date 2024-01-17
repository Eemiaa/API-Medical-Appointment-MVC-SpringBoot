package com.ConsultaMedica.consulta.Repositories;

import com.ConsultaMedica.consulta.Models.SecretariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SecretariaRepository extends JpaRepository<SecretariaModel, UUID> {
    boolean existsByCpf(String cpf);
}
