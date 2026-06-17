package br.com.leperber.sistema_cobrancas_assinaturas.service;

import br.com.leperber.sistema_cobrancas_assinaturas.model.PlanoAssinatura;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.PlanoAssinaturaRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanoAssinaturaService {

    private final PlanoAssinaturaRepository planoAssinaturaRepository;

    public PlanoAssinaturaService(PlanoAssinaturaRepository planoAssinaturaRepository){
        this.planoAssinaturaRepository = planoAssinaturaRepository;
    }

    public PlanoAssinatura criarPlanoAssinatura(PlanoAssinatura planoAssinatura){

        planoAssinaturaRepository.findById(planoAssinatura.getId())
                .ifPresent(id -> {
                    throw new IllegalArgumentException("Plano ja criado com esse mesmo ID!");
                });

        if(planoAssinatura.getNome() == null || planoAssinatura.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estár vazio!");
        }

        return planoAssinaturaRepository.save(planoAssinatura);
    }
}
