package br.com.leperber.sistema_cobrancas_assinaturas.model;


import java.math.BigDecimal;
import java.time.LocalDate;

public class Cobranca {
    private Long id;
    private BigDecimal valor;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private StatusCobranca statusCobranca;

    public Cobranca(BigDecimal valor, LocalDate dataVencimento, StatusCobranca statusCobranca){

        if(valor == null){
            throw new IllegalArgumentException("Valor da cobrança não pode estár vazio!");
        }

        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.statusCobranca = statusCobranca;
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
}
