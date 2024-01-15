package com.ConsultaMedica.consulta.Controllers;

import com.ConsultaMedica.consulta.Dtos.UsuarioDto;
import com.ConsultaMedica.consulta.Models.MedicoModel;
import com.ConsultaMedica.consulta.Models.PacienteModel;
import com.ConsultaMedica.consulta.Models.SecretariaModel;
import com.ConsultaMedica.consulta.Services.SessionService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/session")
public class SessionController {
    final SessionService sessionService;
    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }
    @PostMapping("/create/medico")
    public ResponseEntity<Object> saveMedico(@RequestBody @Valid UsuarioDto usuarioDto){
        //colocar handle aqui
        var medicoModel = new MedicoModel();
        BeanUtils.copyProperties(usuarioDto, medicoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createMedico(medicoModel));
    }
    @PostMapping("/create/paciente")
    public ResponseEntity<Object> savePaciente(@RequestBody @Valid UsuarioDto usuarioDto){
        //colocar handle aqui
        var pacienteModel = new PacienteModel();
        BeanUtils.copyProperties(usuarioDto, pacienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createPaciente(pacienteModel));
    }
    @PostMapping("/create/secretaria")
    public ResponseEntity<Object> saveSecretaria(@RequestBody @Valid UsuarioDto usuarioDto){
        //colocar handle aqui
        var secretariaModel = new SecretariaModel();
        BeanUtils.copyProperties(usuarioDto, secretariaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createSecretaria(secretariaModel));
    }
}
