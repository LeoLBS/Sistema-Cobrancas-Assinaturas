package br.com.leperber.sistema_cobrancas_assinaturas.service;

import br.com.leperber.sistema_cobrancas_assinaturas.model.Cobranca;
import br.com.leperber.sistema_cobrancas_assinaturas.model.MetodoPagamento;
import br.com.leperber.sistema_cobrancas_assinaturas.model.StatusCobranca;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.CobrancaRepository;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.MetodoPagamentoRepository;
import br.com.leperber.sistema_cobrancas_assinaturas.repository.PlanoAssinaturaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class CobrancaService {

    private final CobrancaRepository cobrancaRepository;
    private final PlanoAssinaturaRepository planoAssinaturaRepository;
    private final MetodoPagamentoRepository metodoPagamentoRepository;

    public CobrancaService(CobrancaRepository cobrancaRepository, PlanoAssinaturaRepository planoAssinaturaRepository, MetodoPagamentoRepository metodoPagamentoRepository){
        this.cobrancaRepository = cobrancaRepository;
        this.planoAssinaturaRepository = planoAssinaturaRepository;
        this.metodoPagamentoRepository = metodoPagamentoRepository;
    }

    private Cobranca buscarCobrancaPorId(Long idCobranca){
        return cobrancaRepository.findById(idCobranca)
                .orElseThrow(() -> new IllegalArgumentException("Cobranca não encontrada!"));
    }

    private MetodoPagamento buscarMetodoPagamentoPorID(Long idMetodoPagamento){
        return metodoPagamentoRepository.findById(idMetodoPagamento)
                .orElseThrow(() -> new IllegalArgumentException("Metodo de pagamento não encontrado!"));
    }

    public Cobranca gerarCobranca(Long idPlano, LocalDate dataVencimento){

        var planoAssinatura = planoAssinaturaRepository.findById(idPlano)
                .orElseThrow(() -> new IllegalArgumentException("Plano não encontrado!"));

        Cobranca cobranca = new Cobranca(dataVencimento,planoAssinatura);

        return cobrancaRepository.save(cobranca);
    }

    public Cobranca pagarCobranca(Long idCobranca, Long idMetodoPagamento){
        Cobranca cobranca = buscarCobrancaPorId(idCobranca);
        MetodoPagamento metodoPagamento = buscarMetodoPagamentoPorID(idMetodoPagamento);

        if(cobranca.getStatusCobranca().equals(StatusCobranca.PAGA)){
            throw new IllegalArgumentException("Status da cobranca ja está como paga!");
        }

        cobranca.setMetodoPagamento(metodoPagamento);
        cobranca.setValor(BigDecimal.ZERO);
        cobranca.setStatusCobranca(StatusCobranca.PAGA);
        cobranca.setDataPagamento(LocalDate.now());

        return cobrancaRepository.save(cobranca);
    }

    public Cobranca atualizarValor(Long idCobranca, BigDecimal valorParaAtualizar){
        Cobranca cobranca = buscarCobrancaPorId(idCobranca);

        if(!cobranca.getStatusCobranca().equals(StatusCobranca.PENDENTE) && !cobranca.getStatusCobranca().equals(StatusCobranca.VENCIDA)){
            throw new IllegalArgumentException("A cobranca esta como: " + cobranca.getStatusCobranca() + " por isso não pode ser alterada!");
        }

        if(valorParaAtualizar == null || valorParaAtualizar.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("O valor informado para alteração precisa ser maior que zero!");
        }

        cobranca.setValor(valorParaAtualizar);

        return cobrancaRepository.save(cobranca);
    }
}
