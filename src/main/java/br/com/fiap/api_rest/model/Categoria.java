package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {
    enum Category {
        PERECIVEL,
        NAO_PERECIVEL,
        DIGITAL
    }
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "categoria_produto")
    private Category categoria;

    public Categoria() {
    }

    public Categoria(UUID id, Category categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }
}
