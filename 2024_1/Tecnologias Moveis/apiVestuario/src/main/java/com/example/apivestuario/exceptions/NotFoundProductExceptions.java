package com.example.apivestuario.exceptions;

public class NotFoundProductExceptions extends RuntimeException{
    public NotFoundProductExceptions(){
        super("Nenhum Produto encontrado");
    }
}
