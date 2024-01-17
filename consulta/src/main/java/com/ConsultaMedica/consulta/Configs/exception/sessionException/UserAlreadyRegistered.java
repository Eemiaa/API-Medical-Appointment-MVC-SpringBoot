package com.ConsultaMedica.consulta.Configs.exception.sessionException;

public class UserAlreadyRegistered extends RuntimeException{
    public UserAlreadyRegistered(String userType) {
        super(String.format("%s já registrado.", userType));
    }
}

