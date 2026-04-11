package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.PedidoRequest;
import br.com.fiap.api_rest.dto.ProdutoRequest;
import br.com.fiap.api_rest.mapper.PedidoMapper;
import br.com.fiap.api_rest.model.Pedido;
import br.com.fiap.api_rest.model.Produto;
import br.com.fiap.api_rest.repository.PedidoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PedidoMapper pedidoMapper;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository, PedidoMapper pedidoMapper) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoMapper = pedidoMapper;
    }

    public Pedido create(PedidoRequest pedidoRequest) {
        Pedido pedido = new Pedido();
        pedido.setStatus("INICIALIZADO");
        pedido.setData(LocalDate.now());

        BigDecimal valorTotal = pedidoRequest.pedido().stream()
                .map(Produto::getPreco)
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        pedido.setValor(valorTotal);
        BeanUtils.copyProperties(pedidoRequest, pedido);
        return pedidoRepository.save(pedido);
    }


}
