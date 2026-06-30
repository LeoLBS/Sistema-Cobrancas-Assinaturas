package br.com.leperber.sistema_cobrancas_assinaturas.dto.cobranca;

public class PagarCobrancaDTO {

    private Long idCobranca;
    private Long idMetodoPagamento;

    public Long getIdCobranca() {
        return idCobranca;
    }

    public Long getIdMetodoPagamento() {
        return idMetodoPagamento;
    }

    public void setIdCobranca(Long idCobranca) {
        this.idCobranca = idCobranca;
    }

    public void setIdMetodoPagamento(Long idMetodoPagamento) {
        this.idMetodoPagamento = idMetodoPagamento;
    }
}
