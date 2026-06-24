package br.com.leperber.sistema_cobrancas_assinaturas.service;

import br.com.leperber.sistema_cobrancas_assinaturas.model.MetodoPagamento;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.MetodoPagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    private MetodoPagamento buscarMetodoPagamentoPorId(Long idMetodoPagamento){
        return metodoPagamentoRepository.findById(idMetodoPagamento)
                .orElseThrow(() -> new IllegalArgumentException("Método de pagamento não encontrado!"));
    }

    public MetodoPagamento buscarPorId(Long idMetodoPagamento){
        return buscarMetodoPagamentoPorId(idMetodoPagamento);
    }

    public List<MetodoPagamento> listarTodosMetodoPagamento(){
        return metodoPagamentoRepository.findAll();
    }

    public MetodoPagamento alterarNome(Long idMetodoPagamento, String novoNome){
        MetodoPagamento metodoPagamento = buscarMetodoPagamentoPorId(idMetodoPagamento);

        if(novoNome == null || novoNome.isBlank()){
            throw new IllegalArgumentException("Novo nome não pode estár vazio!");
        }

        metodoPagamento.setNome(novoNome);

        return metodoPagamentoRepository.save(metodoPagamento);
    }

    public MetodoPagamento alterarStatus(Long idMetodoPagamento, Boolean statusNovo){
        MetodoPagamento metodoPagamento = buscarMetodoPagamentoPorId(idMetodoPagamento);

        if(statusNovo == null){
            throw new IllegalArgumentException("O novo status não pode estar vazio!");
        }

        if(metodoPagamento.getHabilitado().equals(statusNovo)){
            throw new IllegalArgumentException("O status do método de pagamento ja se encontra como: " + metodoPagamento.getHabilitado());
        }

        metodoPagamento.setHabilitado(statusNovo);

        return metodoPagamentoRepository.save(metodoPagamento);
    }
}
