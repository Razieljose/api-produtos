package com.produtos.api.controllers;

import com.produtos.api.entities.Vendedor;
import com.produtos.api.repository.VendedorRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api("Api de vendedores")
public class VendedorController {

    @Autowired
    VendedorRepository vendedorRepository;

    @GetMapping("/vendedor")
    @ApiOperation("Listar todos os vendedores")
    public List<Vendedor> listarVendedor() {
        return vendedorRepository.findAll();
    }

    @GetMapping("/vendedor/{nome}")
    @ApiOperation("Listar um vendedor específico pelo seu nome")
    public List<Vendedor> listarVendedorNome(@PathVariable(value = "nome") String nome) {
        return vendedorRepository.findByNome(nome);
    }

    @PostMapping("/vendedor")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Salvar um vendedor")
    public Vendedor salvarVendedor(@RequestBody Vendedor vendedor) {

        return vendedorRepository.save(vendedor);
    }

}
