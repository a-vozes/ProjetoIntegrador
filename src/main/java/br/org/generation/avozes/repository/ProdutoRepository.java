package br.org.generation.avozes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.org.generation.avozes.model.Produto;

public interface ProdutoRepository {

	
	@Repository
	
	public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		public List<Produto> findAllByProdutoContainingIgnoreCase(@Param("nome") String nome);
	}
}
