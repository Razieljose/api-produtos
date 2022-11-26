package com.produtos.api.repository;

import com.produtos.api.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
@Transactional(readOnly = true)
    Optional<Usuario> findByLogin(String login);
}
