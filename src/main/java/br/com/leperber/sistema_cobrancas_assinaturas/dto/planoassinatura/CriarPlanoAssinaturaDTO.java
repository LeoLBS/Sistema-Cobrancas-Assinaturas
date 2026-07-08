package br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura;

import java.math.BigDecimal;

public class CriarPlanoAssinaturaDTO {
    private String nomePlano;
    private BigDecimal precoPlano;

    public CriarPlanoAssinaturaDTO(String nomePlano, BigDecimal precoPlano){
        this.nomePlano = nomePlano;
        this.precoPlano = precoPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public BigDecimal getPrecoPlano() {
        return precoPlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public void setPrecoPlano(BigDecimal precoPlano) {
        this.precoPlano = precoPlano;
    }
}
