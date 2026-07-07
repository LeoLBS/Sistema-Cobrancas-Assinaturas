package br.com.leperber.sistema_cobrancas_assinaturas.dto.metodopagamento;

public class AtualizaNomeMetodoPagamentoDTO {

    private Long idMetodoPagamento;
    private String novoNome;

    public AtualizaNomeMetodoPagamentoDTO(Long idMetoPagamento, String novoNome){
        this.idMetodoPagamento = idMetoPagamento;
        this.novoNome = novoNome;
    }

    public Long getIdMetodoPagamento() {
        return idMetodoPagamento;
    }

    public String getNovoNome() {
        return novoNome;
    }

    public void setIdMetodoPagamento(Long idMetodoPagamento) {
        this.idMetodoPagamento = idMetodoPagamento;
    }

    public void setNovoNome(String novoNome) {
        this.novoNome = novoNome;
    }
}
