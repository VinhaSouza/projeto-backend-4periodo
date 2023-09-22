package com.project_backend.gestaoprodutos.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project_backend.gestaoprodutos.Modelos.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
