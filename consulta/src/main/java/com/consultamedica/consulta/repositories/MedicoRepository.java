package com.consultamedica.consulta.repositories;

import com.consultamedica.consulta.models.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoModel, UUID> {
    boolean existsByCrm(String crm);
}
