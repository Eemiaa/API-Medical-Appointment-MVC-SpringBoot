package com.ConsultaMedica.consulta.Controllers;

import com.ConsultaMedica.consulta.Dtos.MedicoDto;
import com.ConsultaMedica.consulta.Dtos.PacienteDto;
import com.ConsultaMedica.consulta.Dtos.SecretariaDto;
import com.ConsultaMedica.consulta.Models.MedicoModel;
import com.ConsultaMedica.consulta.Models.PacienteModel;
import com.ConsultaMedica.consulta.Models.SecretariaModel;
import com.ConsultaMedica.consulta.Services.SessionService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/session")
public class SessionController {
    final SessionService sessionService;
    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }
    @PostMapping("/create/medico")
    public ResponseEntity<Object> saveMedico(@Valid @RequestBody MedicoDto medicoDto){
        var medicoModel = new MedicoModel();
        BeanUtils.copyProperties(medicoDto, medicoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createMedico(medicoModel));
    }
    @PostMapping("/create/paciente")
    public ResponseEntity<Object> savePaciente(@Valid @RequestBody PacienteDto pacienteDto){
        //colocar handle aqui
        var pacienteModel = new PacienteModel();
        BeanUtils.copyProperties(pacienteDto, pacienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createPaciente(pacienteModel));
    }
    @PostMapping("/create/secretaria")
    public ResponseEntity<Object> saveSecretaria(@Valid @RequestBody SecretariaDto secretariaDto){
        //colocar handle aqui
        var secretariaModel = new SecretariaModel();
        BeanUtils.copyProperties(secretariaDto, secretariaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createSecretaria(secretariaModel));
    }
}
