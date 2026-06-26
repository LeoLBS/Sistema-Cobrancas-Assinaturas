package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.model.PlanoAssinatura;
import br.com.leperber.sistema_cobrancas_assinaturas.service.PlanoAssinaturaService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

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

    @PostMapping("/criar")
    public PlanoAssinatura criarPlano(@RequestBody PlanoAssinatura planoAssinatura){
        return planoAssinaturaService.criarPlanoAssinatura(planoAssinatura);
    }
}
