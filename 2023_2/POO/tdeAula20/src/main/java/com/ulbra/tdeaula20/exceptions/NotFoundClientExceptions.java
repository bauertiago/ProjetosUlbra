package com.ulbra.tdeaula20.exceptions;

public class NotFoundClientExceptions extends RuntimeException{
    public NotFoundClientExceptions(){
        super("Nenhum Cliente encontrado");
    }
}
