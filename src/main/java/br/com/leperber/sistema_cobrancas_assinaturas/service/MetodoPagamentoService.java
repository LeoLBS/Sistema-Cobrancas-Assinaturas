package br.com.leperber.sistema_cobrancas_assinaturas.service;

import br.com.leperber.sistema_cobrancas_assinaturas.model.MetodoPagamento;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.MetodoPagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagamentoService {

    private final MetodoPagamentoRepository metodoPagamentoRepository;

    public MetodoPagamentoService(MetodoPagamentoRepository metodoPagamentoRepository){
        this.metodoPagamentoRepository = metodoPagamentoRepository;
    }

    public MetodoPagamento criarMetodoPagamento(MetodoPagamento metodoPagamento){

        if(metodoPagamento.getNome() == null || metodoPagamento.getNome().isBlank()){
            throw new IllegalArgumentException("Nome não pode estár vazio!");
        }

        return metodoPagamentoRepository.save(metodoPagamento);
    }
}
