package com.consultamedica.consulta.configs.security;

import com.consultamedica.consulta.configs.exception.sessionException.NotFound;
import com.consultamedica.consulta.models.UsuarioModel;
import com.consultamedica.consulta.repositories.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    final UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioModel usuarioModel = usuarioRepository.findByUsername(username).orElseThrow(() -> new NotFound("username", "Usuario"));
        return usuarioModel;
    }
}
