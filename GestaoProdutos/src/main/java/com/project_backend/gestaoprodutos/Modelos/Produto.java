package com.project_backend.gestaoprodutos.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produtoId")
	public Long produtoId;
	@Column(name = "codigoProduto", columnDefinition = "VARCHAR(13)", nullable = false)
	public String codigoproduto;
	@Column(name = "preco", columnDefinition = "VARCHAR(20)", nullable = false)
	public String preco;
	@Column(name = "descricao", columnDefinition="VARCHAR(220)", nullable = false)
	public String descricao;
	@Column(name = "categoria", columnDefinition="VARCHAR(60)", nullable = false)
	public String categoria;
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	public Cliente cliente;
	

}
