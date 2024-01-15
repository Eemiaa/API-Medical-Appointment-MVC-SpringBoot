package com.ConsultaMedica.consulta.Mappers;

import com.ConsultaMedica.consulta.Dtos.UsuarioDto;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioDto usuarioToUsuarioDto(

    );
}
