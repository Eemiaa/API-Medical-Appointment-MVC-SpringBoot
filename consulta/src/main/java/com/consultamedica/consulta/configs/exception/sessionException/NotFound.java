package com.consultamedica.consulta.configs.exception.sessionException;

public class NotFound extends RuntimeException{
    public NotFound(String parametro, String usuario) {
        super(String.format("%s não encontrado para %s.", parametro, usuario));
    }
}
