package br.com.leperber.sistema_cobrancas_assinaturas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MetodoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Boolean habilitado;

    public MetodoPagamento(){}

    public MetodoPagamento(String nome){
        this.nome = nome;
        this.habilitado = true;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
}
