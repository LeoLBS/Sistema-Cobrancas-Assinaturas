package br.com.leperber.sistema_cobrancas_assinaturas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class PlanoAssinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal preco;
    private String descricao;
    private Boolean habilitado;

    public PlanoAssinatura(){}

    public PlanoAssinatura(String nome, BigDecimal preco){
        if(nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        if (preco == null){
            throw new IllegalArgumentException("O preço não pode ser vazio!");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
}
