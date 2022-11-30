package com.produtos.api.controllers;

import com.produtos.api.entities.Produto;
import com.produtos.api.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api("Api de produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation("Obter toda a lista de produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{nome}")
    @ApiOperation("Obter um produto espcífico pelo seu nome")
    public List<Produto> listarProdutoNome(@PathVariable(value = "nome") String nome) {
        return produtoRepository.findByNome(nome);
    }

    @PostMapping("/produtos")
    @ApiOperation("Salvar um produto")
    public Produto salvaProduto(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produtos/{id}")
    @ApiOperation("Deletar um produto pelo seu ID")
    public void deletaProduto(@PathVariable(value = "id") Long id) {
        produtoRepository.deleteById(id);

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/produtos")
    @ApiOperation("Atualizar um produto já existente")
    public Produto atualizaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
