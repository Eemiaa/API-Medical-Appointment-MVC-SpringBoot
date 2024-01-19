package com.consultamedica.consulta.controllers;

import com.consultamedica.consulta.dtos.MedicoDto;
import com.consultamedica.consulta.dtos.PacienteDto;
import com.consultamedica.consulta.dtos.SecretariaDto;
import com.consultamedica.consulta.dtos.UsuarioDto;
import com.consultamedica.consulta.models.MedicoModel;
import com.consultamedica.consulta.models.PacienteModel;
import com.consultamedica.consulta.models.SecretariaModel;
import com.consultamedica.consulta.models.UsuarioModel;
import com.consultamedica.consulta.services.SessionService;
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
    public ResponseEntity<Object> createMedico(@Valid @RequestBody MedicoDto medicoDto){
        var medicoModel = new MedicoModel();
        BeanUtils.copyProperties(medicoDto, medicoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createMedico(medicoModel));
    }
    @PostMapping("/create/paciente")
    public ResponseEntity<Object> createPaciente(@Valid @RequestBody PacienteDto pacienteDto){
        var pacienteModel = new PacienteModel();
        BeanUtils.copyProperties(pacienteDto, pacienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createPaciente(pacienteModel));
    }
    @PostMapping("/create/secretaria")
    public ResponseEntity<Object> createSecretaria(@Valid @RequestBody SecretariaDto secretariaDto){
        var secretariaModel = new SecretariaModel();
        BeanUtils.copyProperties(secretariaDto, secretariaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createSecretaria(secretariaModel));
    }
    @PostMapping("/create/usuario")
    public ResponseEntity<Object> createUsuario(@Valid @RequestBody UsuarioDto usuarioDto){
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.createUsuario(usuarioModel));
    }
    @PostMapping("/login/usuario")
    public ResponseEntity<Object> loginUsuario(@Valid @RequestBody UsuarioDto usuarioDto){
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.loginUsuario(usuarioModel));
    }
}
