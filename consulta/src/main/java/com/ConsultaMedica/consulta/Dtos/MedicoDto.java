package com.ConsultaMedica.consulta.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class MedicoDto {
    @NotBlank
    @Size(max = 45)
    @JsonProperty("nome")
    private String nome;

    @NotBlank
    @Size(max = 8)
    @JsonProperty("cep")
    private String cep;

    @NotBlank
    @Size(max = 13)
    @JsonProperty("telefone")
    private String telefone;

    @NotBlank
    @Size(max = 45)
    @JsonProperty("crm")
    private String crm;
}
