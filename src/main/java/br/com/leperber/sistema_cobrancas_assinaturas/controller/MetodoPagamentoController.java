package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.dto.metodopagamento.AtualizaNomeMetodoPagamentoDTO;
import br.com.leperber.sistema_cobrancas_assinaturas.dto.metodopagamento.CriarMetodoPagamentoDTO;
import br.com.leperber.sistema_cobrancas_assinaturas.model.MetodoPagamento;
import br.com.leperber.sistema_cobrancas_assinaturas.service.MetodoPagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mepagamento")
public class MetodoPagamentoController {

    private final MetodoPagamentoService metodoPagamentoService;

    public MetodoPagamentoController(MetodoPagamentoService metodoPagamentoService){
        this.metodoPagamentoService = metodoPagamentoService;
    }

    @GetMapping
    public List<MetodoPagamento> listarTodosMetodoPagamento(){
        return metodoPagamentoService.listarTodosMetodoPagamento();
    }

    @GetMapping("/{idMetodoPagamento}")
    public MetodoPagamento buscarPorId(@PathVariable Long idMetodoPagamento){
        return metodoPagamentoService.buscarPorId(idMetodoPagamento);
    }

    @PostMapping("/criar")
    public MetodoPagamento criarMetodoPagamento(@RequestBody CriarMetodoPagamentoDTO criarMetodoPagamentoDTO){
        return metodoPagamentoService.criarMetodoPagamento(criarMetodoPagamentoDTO.getNomeMetodo());
    }

    @PutMapping("/alterarNome")
    public MetodoPagamento alterarNome(
            @RequestBody AtualizaNomeMetodoPagamentoDTO atualizaNomeMetodoPagamentoDTO){

        return metodoPagamentoService.alterarNome(
                atualizaNomeMetodoPagamentoDTO.getIdMetodoPagamento(),
                atualizaNomeMetodoPagamentoDTO.getNovoNome());
    }

    @PutMapping("/alterarStatus/{idMetodoPagamento}")
    public MetodoPagamento alterarStatus(
            @PathVariable Long idMetodoPagamento,
            @RequestBody Map<String, Boolean> dados){

        return metodoPagamentoService.alterarStatus(idMetodoPagamento, dados.get("novoStatus"));
    }
}
