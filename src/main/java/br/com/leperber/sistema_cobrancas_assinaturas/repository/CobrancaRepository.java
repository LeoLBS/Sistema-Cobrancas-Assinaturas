package br.com.leperber.sistema_cobrancas_assinaturas.repository;

import br.com.leperber.sistema_cobrancas_assinaturas.model.Cobranca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobrancaRepository extends JpaRepository<Cobranca, Long> {
}
