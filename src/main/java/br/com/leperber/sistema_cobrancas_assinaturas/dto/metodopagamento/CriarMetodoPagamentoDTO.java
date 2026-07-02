package br.com.leperber.sistema_cobrancas_assinaturas.dto.metodopagamento;

public class CriarMetodoPagamentoDTO {

    private String nomeMetodo;

    public CriarMetodoPagamentoDTO(String nomeMetodo){
        this.nomeMetodo = nomeMetodo;
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }
}
