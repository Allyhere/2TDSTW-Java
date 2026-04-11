package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record PedidoResponse(UUID id, String status, LocalDate data, List<Produto> pedido, BigDecimal valor) {
}
