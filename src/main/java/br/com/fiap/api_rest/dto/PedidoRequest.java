package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Produto;
import jakarta.validation.constraints.*;

import java.util.List;

public record PedidoRequest(
        @NotNull
        @Size(min = 1, message = "A lista de pedidos não pode ser vazia")
        List<Produto> pedido
) {
}

