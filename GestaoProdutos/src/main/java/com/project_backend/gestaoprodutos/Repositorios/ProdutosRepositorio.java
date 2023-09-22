package com.project_backend.gestaoprodutos.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project_backend.gestaoprodutos.Modelos.Produto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepositorio extends JpaRepository<Produto, Long> {
	List<Produto> findByIdIn(List<Long> ids);
}
