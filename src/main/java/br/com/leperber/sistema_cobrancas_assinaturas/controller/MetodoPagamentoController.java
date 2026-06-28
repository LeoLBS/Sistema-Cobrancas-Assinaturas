package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.service.MetodoPagamentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MePagamento")
public class MetodoPagamentoController {

    private final MetodoPagamentoService metodoPagamentoService;

    public MetodoPagamentoController(MetodoPagamentoService metodoPagamentoService){
        this.metodoPagamentoService = metodoPagamentoService;
    }


}
