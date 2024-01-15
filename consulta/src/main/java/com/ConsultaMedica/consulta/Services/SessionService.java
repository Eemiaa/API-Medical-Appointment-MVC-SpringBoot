package com.ConsultaMedica.consulta.Services;

import com.ConsultaMedica.consulta.Models.MedicoModel;
import com.ConsultaMedica.consulta.Models.PacienteModel;
import com.ConsultaMedica.consulta.Models.SecretariaModel;
import com.ConsultaMedica.consulta.Repositories.MedicoRepository;
import com.ConsultaMedica.consulta.Repositories.PacienteRepository;
import com.ConsultaMedica.consulta.Repositories.SecretariaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
    final MedicoRepository medicoRepository;
    final PacienteRepository pacienteRepository;
    final SecretariaRepository secretariaRepository;

    public SessionService(MedicoRepository medicoRepository, PacienteRepository pacienteRepository, SecretariaRepository secretariaRepository){
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
        this.secretariaRepository = secretariaRepository;
    }

    @Transactional
    public MedicoModel createMedico(MedicoModel medicoModel) {
        return medicoRepository.save(medicoModel);
    }
    public PacienteModel createPaciente(PacienteModel pacienteModel) {
        return pacienteRepository.save(pacienteModel);
    }
    public SecretariaModel createSecretaria(SecretariaModel secretariaModel){
        return secretariaRepository.save(secretariaModel);
    }
}
