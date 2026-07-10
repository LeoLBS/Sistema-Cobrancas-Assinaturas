package br.com.leperber.sistema_cobrancas_assinaturas.controller;

import br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura.AtualizaDescricaoPlanoAssinaturaDTO;
import br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura.AtualizaNomePlanoAssinaturaDTO;
import br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura.AtualizaPrecoPlanoAssinaturaDTO;
import br.com.leperber.sistema_cobrancas_assinaturas.dto.planoassinatura.CriarPlanoAssinaturaDTO;
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
    public PlanoAssinatura criarPlano(
            @RequestBody CriarPlanoAssinaturaDTO criarPlanoAssinaturaDTO){
        return planoAssinaturaService.criarPlanoAssinatura(
                criarPlanoAssinaturaDTO.getNomePlano(),
                criarPlanoAssinaturaDTO.getPrecoPlano());
    }

    @PutMapping("/alteraNome")
    public PlanoAssinatura alterarNome(
            @RequestBody AtualizaNomePlanoAssinaturaDTO atualizaNomePlanoAssinaturaDTO){

        return planoAssinaturaService.alterarNome(
                atualizaNomePlanoAssinaturaDTO.getIdPlano(),
                atualizaNomePlanoAssinaturaDTO.getNovoNome());
    }

    @PutMapping("/alteraPreco")
    public PlanoAssinatura alterarPreco(
            @RequestBody AtualizaPrecoPlanoAssinaturaDTO atualizaPrecoPlanoAssinaturaDTO){

        return planoAssinaturaService.alterarPreco(
                atualizaPrecoPlanoAssinaturaDTO.getIdPlano(),
                atualizaPrecoPlanoAssinaturaDTO.getNovoPreco());
    }

    @PutMapping("/alteraDescricao")
    public PlanoAssinatura alterarDescricao(
            @RequestBody AtualizaDescricaoPlanoAssinaturaDTO atualizaDescricaoPlanoAssinaturaDTO){

        return  planoAssinaturaService.alterarDescricao(
                atualizaDescricaoPlanoAssinaturaDTO.getIdPlano(),
                atualizaDescricaoPlanoAssinaturaDTO.getNovaDescricao()
        );
    }

    @PutMapping("/alteraStatus/{idPlano}")
    public PlanoAssinatura alteraStatus(
            @PathVariable Long idPlano,
            @RequestBody Map<String, Boolean> dados){

        return  planoAssinaturaService.alteraStatus(idPlano, dados.get("novoStatus"));

    }
}
