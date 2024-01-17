package com.ConsultaMedica.consulta.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class MedicoDto {
    @NotBlank(message = "Campo nome não pode ser nulo.")
    @Size(max = 45, message = "O tamanho ultrapassa o máximo de {max} caracteres.")
    @JsonProperty("nome")
    private String nome;

    @NotBlank(message = "Campo cep não pode ser nulo.")
    @Size(max = 8, message = "O tamanho ultrapassa o máximo de {max} caracteres.")
    @JsonProperty("cep")
    private String cep;

    @NotBlank(message = "Campo telefone não pode ser nulo.")
    @Size(max = 13, message = "O tamanho ultrapassa o máximo de {max} caracteres.")
    @JsonProperty("telefone")
    private String telefone;

    @NotBlank(message = "Campo crm não pode ser nulo.")
    @Size(max = 45,  message = "O tamanho ultrapassa o máximo de {max} caracteres.")
    @JsonProperty("crm")
    private String crm;
}
