package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, UUID>  {
}
