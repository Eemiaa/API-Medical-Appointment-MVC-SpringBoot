package com.ConsultaMedica.consulta.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class UsuarioDto {
    @NotBlank
    @Size(max = 45)
    @JsonProperty("nome")
    private String nome;

    @NotBlank
    @Size(max = 11)
    @JsonProperty("cpf")
    private String cpf;

    @NotBlank
    @Size(max = 13)
    @JsonProperty("telefone")
    private String telefone;

    @NotBlank
    @Size(max = 45)
    @JsonProperty("crm")
    private String crm;
}
