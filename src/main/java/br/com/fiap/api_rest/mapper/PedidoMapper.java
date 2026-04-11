package br.com.fiap.api_rest.mapper;

import br.com.fiap.api_rest.dto.PedidoResponse;
import br.com.fiap.api_rest.model.Pedido;
import org.springframework.stereotype.Component;


@Component
public class PedidoMapper {
    public PedidoResponse pedidoToResponse(Pedido pedido) {
        return new PedidoResponse(pedido.getId(), pedido.getStatus(),pedido.getData(), pedido.getPedido(), pedido.getValor());
    }


}
