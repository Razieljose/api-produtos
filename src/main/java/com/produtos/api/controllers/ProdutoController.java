package com.produtos.api.controllers;

import com.produtos.api.entities.Produto;
import com.produtos.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{nome}")
    public List<Produto> listarProdutoNome(@PathVariable(value = "nome") String nome) {
        return produtoRepository.findByNome(nome);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto salvaProduto(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produtos/{id}")
    public void deletaProduto(@PathVariable(value = "id") Long id) {
        produtoRepository.deleteById(id);

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/produtos")
    public Produto atualizaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
