package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.service.PlanoAssinaturaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planos")
public class PlanoAssinaturaController {

    private final PlanoAssinaturaService planoAssinaturaService;

    public PlanoAssinaturaController(PlanoAssinaturaService planoAssinaturaService){
        this.planoAssinaturaService = planoAssinaturaService;
    }


}
