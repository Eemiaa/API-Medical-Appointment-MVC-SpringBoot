package com.consultamedica.consulta.dtos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class UsuarioDto {
    @Email(message = "As informações passadas não correspondem com um email.")
    @NotBlank(message = "Campo nome não pode ser nulo.")
    @JsonProperty("email")
    private String email;

    @NotBlank(message = "Campo nome não pode ser nulo.")
    @JsonProperty("senha")
    private String senha;

    @NotBlank(message = "Campo nome não pode ser nulo.")
    @JsonProperty("username")
    private String username;
}
