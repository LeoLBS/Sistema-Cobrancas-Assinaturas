package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.model.MetodoPagamento;
import br.com.leperber.sistema_cobrancas_assinaturas.service.MetodoPagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public MetodoPagamento criarMetodoPagamento(@RequestBody MetodoPagamento metodoPagamento){
        return metodoPagamentoService.criarMetodoPagamento(metodoPagamento);
    }
}
