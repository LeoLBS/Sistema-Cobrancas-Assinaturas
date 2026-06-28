package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.model.PlanoAssinatura;
import br.com.leperber.sistema_cobrancas_assinaturas.service.PlanoAssinaturaService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/planos")
public class PlanoAssinaturaController {

    private final PlanoAssinaturaService planoAssinaturaService;

    public PlanoAssinaturaController(PlanoAssinaturaService planoAssinaturaService){
        this.planoAssinaturaService = planoAssinaturaService;
    }

    @GetMapping
    public List<PlanoAssinatura> listarTodosPlanos(){
        return planoAssinaturaService.listarTodosPlanoAssinatura();
    }

    @GetMapping("/{idPlano}")
    public PlanoAssinatura buscarPorId(@PathVariable Long idPlano){
        return planoAssinaturaService.buscarPorId(idPlano);
    }

    @PostMapping("/criar")
    public PlanoAssinatura criarPlano(@RequestBody PlanoAssinatura planoAssinatura){
        return planoAssinaturaService.criarPlanoAssinatura(planoAssinatura);
    }

    @PutMapping("/{idPlano}")
    public PlanoAssinatura alterarNome(
            @PathVariable Long idPlano,
            @RequestBody Map<String, String> dados){

        return planoAssinaturaService.alterarNome(idPlano, dados.get("novoNome"));
    }
}
