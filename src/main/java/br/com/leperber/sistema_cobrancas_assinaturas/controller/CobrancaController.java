package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.dto.cobranca.CriarCobrancaDTO;
import br.com.leperber.sistema_cobrancas_assinaturas.model.Cobranca;
import br.com.leperber.sistema_cobrancas_assinaturas.service.CobrancaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cobranca")
public class CobrancaController {

    private final CobrancaService cobrancaService;

    public CobrancaController(CobrancaService cobrancaService){
        this.cobrancaService = cobrancaService;
    }

    @GetMapping
    public List<Cobranca> listarTodasCobrancas(){
        return cobrancaService.listarTodasCobrancas();
    }

    @GetMapping("/{idCobranca}")
    public Cobranca buscarPorId(@PathVariable Long idCobranca){
        return cobrancaService.buscarPorId(idCobranca);
    }

    @PostMapping("/criar")
    public Cobranca gerarCobranca(@RequestBody CriarCobrancaDTO criarCobrancaDTO){
        return cobrancaService.gerarCobranca(criarCobrancaDTO.getIdPlano(), criarCobrancaDTO.getDataVencimento());
    }
}
