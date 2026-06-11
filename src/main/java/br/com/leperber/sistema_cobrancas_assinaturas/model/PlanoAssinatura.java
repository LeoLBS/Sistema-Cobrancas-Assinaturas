package br.com.leperber.sistema_cobrancas_assinaturas.model;

import java.math.BigDecimal;

public class PlanoAssinatura {

    private Long id;
    private String nome;
    private BigDecimal preco;
    private String descricao;
    private Boolean habilitado;

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
