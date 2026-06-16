package br.com.leperber.sistema_cobrancas_assinaturas.service;

import br.com.leperber.sistema_cobrancas_assinaturas.model.Cobranca;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.CobrancaRepository;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.PlanoAssinaturaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CobrancaService {

    private final CobrancaRepository cobrancaRepository;
    private final PlanoAssinaturaRepository planoAssinaturaRepository;

    public CobrancaService(CobrancaRepository cobrancaRepository, PlanoAssinaturaRepository planoAssinaturaRepository){
        this.cobrancaRepository = cobrancaRepository;
        this.planoAssinaturaRepository = planoAssinaturaRepository;
    }

    public Cobranca gerarCobranca(Long idPlano, LocalDate dataVencimento){

        var planoAssinatura = planoAssinaturaRepository.findById(idPlano)
                .orElseThrow(() -> new IllegalArgumentException("Plano não encontrado!"));

        Cobranca cobranca = new Cobranca(dataVencimento,planoAssinatura);

        return cobrancaRepository.save(cobranca);
    }


}
