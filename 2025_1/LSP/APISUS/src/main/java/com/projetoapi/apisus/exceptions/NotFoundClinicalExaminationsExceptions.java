package com.projetoapi.apisus.exceptions;

public class NotFoundClinicalExaminationsExceptions extends RuntimeException{
    public NotFoundClinicalExaminationsExceptions(){
        super("Nenhum Exame Clínico encontrado!!");
    }
}
