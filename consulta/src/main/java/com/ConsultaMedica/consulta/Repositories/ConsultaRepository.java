package com.ConsultaMedica.consulta.Repositories;

import com.ConsultaMedica.consulta.Models.ConsultaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaModel, UUID> {

}
