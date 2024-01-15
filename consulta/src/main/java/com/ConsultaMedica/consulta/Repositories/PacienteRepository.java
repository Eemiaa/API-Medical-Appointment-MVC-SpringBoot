package com.ConsultaMedica.consulta.Repositories;

import com.ConsultaMedica.consulta.Models.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, UUID> {
}
