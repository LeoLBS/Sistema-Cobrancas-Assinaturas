package br.com.leperber.sistema_cobrancas_assinaturas.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Cobranca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    @Enumerated(EnumType.STRING)
    private StatusCobranca statusCobranca;
    @ManyToOne
    private PlanoAssinatura planoAssinatura;
    @ManyToOne
    private MetodoPagamento metodoPagamento;

    public Cobranca(){}

    public Cobranca( LocalDate dataVencimento, PlanoAssinatura planoAssinatura){
        this.planoAssinatura = planoAssinatura;
        this.valor = planoAssinatura.getPreco();
        this.dataVencimento = dataVencimento;
        this.statusCobranca = StatusCobranca.PENDENTE;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public StatusCobranca getStatusCobranca() {
        return statusCobranca;
    }

    public PlanoAssinatura getPlanoAssinatura(){ return planoAssinatura; }

    public MetodoPagamento getMetodoPagamento(){ return  metodoPagamento; }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setStatusCobranca(StatusCobranca statusCobranca) {
        this.statusCobranca = statusCobranca;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) { this.planoAssinatura = planoAssinatura; }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) { this.metodoPagamento = metodoPagamento; }
}
