package br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura;

import java.math.BigDecimal;

public class AtualizaPrecoPlanoAssinaturaDTO {

    private Long idPlano;
    private BigDecimal novoPreco;

    public AtualizaPrecoPlanoAssinaturaDTO(Long idPlano, BigDecimal novoPreco){
        this.idPlano = idPlano;
        this.novoPreco = novoPreco;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public BigDecimal getNovoPreco() {
        return novoPreco;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

    public void setNovoPreco(BigDecimal novoPreco) {
        this.novoPreco = novoPreco;
    }
}
