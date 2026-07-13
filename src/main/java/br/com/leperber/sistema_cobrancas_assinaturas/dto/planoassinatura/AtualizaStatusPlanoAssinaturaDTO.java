package br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura;

public class AtualizaStatusPlanoAssinaturaDTO {

    private Long idPlano;
    private Boolean novoStatus;

    public AtualizaStatusPlanoAssinaturaDTO(Long idPlano, Boolean novoStatus){
        this.idPlano = idPlano;
        this.novoStatus = novoStatus;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public Boolean getNovoStatus() {
        return novoStatus;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

    public void setNovoStatus(Boolean novoStatus) {
        this.novoStatus = novoStatus;
    }
}
