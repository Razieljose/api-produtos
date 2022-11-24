package com.produtos.api.exception;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException(){
        super("Senha inválida!");
    }
}
