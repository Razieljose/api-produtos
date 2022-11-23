package com.produtos.api.controllers;

import com.produtos.api.entities.Vendedor;
import com.produtos.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class VendedorController {

    @Autowired
    VendedorRepository vendedorRepository;

    @GetMapping("/vendedor")
    public List<Vendedor> listarVendedor() {
        return vendedorRepository.findAll();
    }

    @GetMapping("/vendedor/{nome}")
    public List<Vendedor> listarVendedorNome(@PathVariable(value = "nome") String nome) {
        return vendedorRepository.findByNome(nome);
    }

    @PostMapping("/vendedor")
    public Vendedor salvarVendedor(@RequestBody Vendedor vendedor) {

        return vendedorRepository.save(vendedor);
    }

}
