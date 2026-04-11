package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_PEDIDOS")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "status_pedido")
    private String status;
    @Column(name = "data_pedido")
    private LocalDate data;
    private List<Produto> pedido;
    @Column(name = "valor_pedido")
    private Double valor;

    public Pedido() {
    }

    public Pedido(String status, LocalDate data, List<Produto> pedido, Double valor) {
        this.status = status;
        this.data = data;
        this.pedido = pedido;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Produto> getPedido() {
        return pedido;
    }

    public void setPedido(List<Produto> pedido) {
        this.pedido = pedido;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
