package br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura;

public class AtualizaNomePlanoAssinaturaDTO {

    private Long idPlano;
    private String novoNome;

    public AtualizaNomePlanoAssinaturaDTO(Long idPlano, String novoNome){
        this.idPlano = idPlano;
        this.novoNome = novoNome;
    }

    public String getNovoNome() {
        return novoNome;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public void setNovoNome(String novoNome) {
        this.novoNome = novoNome;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }
}
