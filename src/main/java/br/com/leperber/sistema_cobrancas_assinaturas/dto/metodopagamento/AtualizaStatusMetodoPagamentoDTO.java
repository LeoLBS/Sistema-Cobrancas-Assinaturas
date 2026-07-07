package br.com.leperber.sistema_cobrancas_assinaturas.dto.metodopagamento;

public class AtualizaStatusMetodoPagamentoDTO {

    private Long idMetodoPagamento;
    private Boolean novoStatus;

    public AtualizaStatusMetodoPagamentoDTO(Long idMetodoPagamento, Boolean novoStatus){
        this.idMetodoPagamento = idMetodoPagamento;
        this.novoStatus = novoStatus;
    }

    public Long getIdMetodoPagamento() {
        return idMetodoPagamento;
    }

    public Boolean getNovoStatus() {
        return novoStatus;
    }

    public void setIdMetodoPagamento(Long idMetodoPagamento) {
        this.idMetodoPagamento = idMetodoPagamento;
    }

    public void setNovoStatus(Boolean novoStatus) {
        this.novoStatus = novoStatus;
    }
}
