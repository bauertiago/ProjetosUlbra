package com.projetoapi.apisus.exceptions;

public class NotFoundSchedulingExceptions extends RuntimeException{
    public NotFoundSchedulingExceptions(){
        super("Nenhum Agendamento encontrado!!");
    }
}
