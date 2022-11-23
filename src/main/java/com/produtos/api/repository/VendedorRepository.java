package com.produtos.api.repository;

import com.produtos.api.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

    List<Vendedor> findByNome(String nome);
}
