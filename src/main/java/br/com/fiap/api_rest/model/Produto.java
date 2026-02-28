package br.com.fiap.api_rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name= "DB_PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "nome_produto")
    private String nome_produto;
    @Column(name = "preco")
    private BigDecimal preco;
    @Column(name = "expiracao")
    private LocalDate expiracao;

    public Produto() {
    }

    public Produto(String nome_produto, BigDecimal preco, LocalDate expiracao) {
        this.nome_produto = nome_produto;
        this.preco = preco;
        this.expiracao = expiracao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome_produto;
    }

    public void setNome(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(LocalDate expiracao) {
        this.expiracao = expiracao;
    }
}
