package com.produtos.api.repository;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.produtos.api.entities.Produto;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	@Query
	List <Produto> findByNome(String nome);
	@Query
	ProdutoRepository deleteById(Id id);


}
