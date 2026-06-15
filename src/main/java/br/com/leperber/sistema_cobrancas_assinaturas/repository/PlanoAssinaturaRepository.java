package br.com.leperber.sistema_cobrancas_assinaturas.repository;

import br.com.leperber.sistema_cobrancas_assinaturas.model.PlanoAssinatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoAssinaturaRepository extends JpaRepository<PlanoAssinatura, Long> {
}
