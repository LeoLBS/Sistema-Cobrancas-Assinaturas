package br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura;

public class AtualizaDescricaoPlanoAssinaturaDTO {

    private Long idPlano;
    private String novaDescricao;

    public AtualizaDescricaoPlanoAssinaturaDTO(Long idPlano, String novaDescricao){
        this.idPlano = idPlano;
        this.novaDescricao = novaDescricao;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public String getNovaDescricao() {
        return novaDescricao;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

    public void setNovaDescricao(String novaDescricao) {
        this.novaDescricao = novaDescricao;
    }
}
