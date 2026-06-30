package br.com.leperber.sistema_cobrancas_assinaturas.dto.cobranca;

import java.time.LocalDate;

public class CriarCobrancaDTO {

    private Long idPlano;
    private LocalDate dataVencimento;

    public Long getIdPlano() {
        return idPlano;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
