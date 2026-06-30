package br.com.leperber.sistema_cobrancas_assinaturas.dto.cobranca;

import java.math.BigDecimal;

public class AtualizaValorCobrancaDTO {

    private Long idCobranca;
    private BigDecimal novoValor;

    public Long getIdCobranca() {
        return idCobranca;
    }

    public BigDecimal getNovoValor() {
        return novoValor;
    }

    public void setIdCobranca(Long idCobranca) {
        this.idCobranca = idCobranca;
    }

    public void setNovoValor(BigDecimal novoValor) {
        this.novoValor = novoValor;
    }
}
