package br.com.leperber.sistema_cobrancas_assinaturas.dto.cobranca;

import java.time.LocalDate;

public class AtualizaVencimentoCobrancaDTO {

    private Long idCobranca;
    private LocalDate novoVencimento;

    public Long getIdCobranca() {
        return idCobranca;
    }

    public LocalDate getNovoVencimento() {
        return novoVencimento;
    }

    public void setIdCobranca(Long idCobranca) {
        this.idCobranca = idCobranca;
    }

    public void setNovoVencimento(LocalDate novoVencimento) {
        this.novoVencimento = novoVencimento;
    }
}
