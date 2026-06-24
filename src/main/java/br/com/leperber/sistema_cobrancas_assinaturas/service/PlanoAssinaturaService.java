package br.com.leperber.sistema_cobrancas_assinaturas.service;

import br.com.leperber.sistema_cobrancas_assinaturas.model.PlanoAssinatura;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.PlanoAssinaturaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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

    private PlanoAssinatura buscarPlanoAssinaturaPorId(Long idPlanoAssinatura){
        return planoAssinaturaRepository.findById(idPlanoAssinatura)
                .orElseThrow(() -> new IllegalArgumentException("Plano de assinatura não encontrado!"));
    }

    public PlanoAssinatura buscarPorId(Long idPlanoAssinatura){
        return buscarPlanoAssinaturaPorId(idPlanoAssinatura);
    }

    public List<PlanoAssinatura> listarTodosPlanoAssinatura(){
        return planoAssinaturaRepository.findAll();
    }

    public PlanoAssinatura alterarNome(Long idPlanoAssinatura, String novoNome){
        PlanoAssinatura planoAssinatura = buscarPlanoAssinaturaPorId(idPlanoAssinatura);

        if(novoNome == null || novoNome.isBlank()){
            throw new IllegalArgumentException("Novo nome não pode estár vazio!");
        }

        planoAssinatura.setNome(novoNome);

        return planoAssinaturaRepository.save(planoAssinatura);
    }

    public PlanoAssinatura alterarPreco(Long idPlanoAssinatura, BigDecimal novoPreco){
        PlanoAssinatura planoAssinatura = buscarPlanoAssinaturaPorId(idPlanoAssinatura);

        if(novoPreco == null || novoPreco.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("O novo preço não pode estar vazio!");
        }

        planoAssinatura.setPreco(novoPreco);

        return  planoAssinaturaRepository.save(planoAssinatura);
    }
}
