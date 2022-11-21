package com.produtos.api.repository;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produtos.api.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	List <Produto> findByNome(String nome);
	
	ProdutoRepository deleteById(Id id);


}
