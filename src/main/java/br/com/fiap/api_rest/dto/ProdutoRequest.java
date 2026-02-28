package br.com.fiap.api_rest.dto;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProdutoRequest(
        @NotBlank(message = "O nome é obrigatório")
        @Size(min = 2, max = 150, message = "No mínimo 2 caracteres")
        String nome_produto,
        @DecimalMin(value = "0.99", message = "O valor mínimo deve ser 0.99")
        BigDecimal preco,
        @DateTimeFormat(pattern = "dd/MM/yyyy")
        LocalDate expiracao
) {

}
