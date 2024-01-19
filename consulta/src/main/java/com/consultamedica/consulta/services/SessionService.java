package com.consultamedica.consulta.services;

import com.consultamedica.consulta.configs.exception.sessionException.UserAlreadyRegistered;
import com.consultamedica.consulta.models.MedicoModel;
import com.consultamedica.consulta.models.PacienteModel;
import com.consultamedica.consulta.models.SecretariaModel;
import com.consultamedica.consulta.models.UsuarioModel;
import com.consultamedica.consulta.repositories.MedicoRepository;
import com.consultamedica.consulta.repositories.PacienteRepository;
import com.consultamedica.consulta.repositories.SecretariaRepository;
import com.consultamedica.consulta.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
    final MedicoRepository medicoRepository;
    final PacienteRepository pacienteRepository;
    final SecretariaRepository secretariaRepository;
    final UsuarioRepository usuarioRepository;

    public SessionService(MedicoRepository medicoRepository, PacienteRepository pacienteRepository, SecretariaRepository secretariaRepository, UsuarioRepository usuarioRepository){
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
        this.secretariaRepository = secretariaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public UsuarioModel createUsuario(UsuarioModel usuarioModel){
        if(usuarioRepository.existsByEmail(usuarioModel.getEmail())){
            throw new UserAlreadyRegistered("Usuário com email");
        }
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel loginUsuario(UsuarioModel usuarioModel){
        if(usuarioRepository.existsByEmail(usuarioModel.getEmail())){
            throw new UserAlreadyRegistered("Usuário com email");
        }
        return usuarioRepository.save(usuarioModel);
    }

    public MedicoModel createMedico(MedicoModel medicoModel) {
        if(medicoRepository.existsByCrm(medicoModel.getCrm())){
            throw new UserAlreadyRegistered("Médico");
        }
        return medicoRepository.save(medicoModel);
    }
    public PacienteModel createPaciente(PacienteModel pacienteModel) {
        if(pacienteRepository.existsByCpf(pacienteModel.getCpf())){
            throw new UserAlreadyRegistered("Paciente");
        }
        return pacienteRepository.save(pacienteModel);
    }
    public SecretariaModel createSecretaria(SecretariaModel secretariaModel){
        if(secretariaRepository.existsByCpf(secretariaModel.getCpf())){
            throw new UserAlreadyRegistered("Secretária");
        }
        return secretariaRepository.save(secretariaModel);
    }
}
