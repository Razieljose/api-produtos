package com.produtos.api.dto;

import javax.validation.constraints.NotBlank;


public class VendedorDTO {
    private Long id;


    @NotBlank
    private String nome;


    @NotBlank
    private String setor;
}
