package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "email_cliente")
    private String email;

    @Column(name = "CPF_cliente")
    private String CPF;

    @Column(name = "data_nasc")
    private LocalDate data_nascimento;

    @Column(name = "telefone_cliente")
    private String telefone;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public Cliente(String nome, String email, String CPF, LocalDate data_nascimento, String telefone) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }
}
