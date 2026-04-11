package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_ESTOQUE")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "nome_produto")
    private String nome;

    public Estoque(String nome) {
        this.nome = nome;
    }

    public Estoque() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
