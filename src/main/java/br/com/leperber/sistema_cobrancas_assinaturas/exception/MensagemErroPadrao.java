package br.com.leperber.sistema_cobrancas_assinaturas.exception;

import java.time.LocalDate;

public class MensagemErroPadrao {

    private LocalDate dataErro;
    private Integer codigoErro;
    private String erro;
    private String mensagemErro;

    public MensagemErroPadrao(LocalDate dataErro, Integer codigoErro, String erro, String mensagemErro){
        this.dataErro = dataErro;
        this.codigoErro = codigoErro;
        this.erro = erro;
        this.mensagemErro = mensagemErro;
    }

    public LocalDate getDataErro() {
        return dataErro;
    }

    public Integer getCodigoErro() {
        return codigoErro;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public String getErro() {
        return erro;
    }
}
