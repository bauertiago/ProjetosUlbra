package com.projetoapi.apisus.exceptions;

public class NotFoundSchedulingExeptions extends RuntimeException{
    public NotFoundSchedulingExeptions(){
        super("Nenhum Agendamento encontrado!!");
    }
}
