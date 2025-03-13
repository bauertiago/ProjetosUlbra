package com.projetoapi.apisus.exceptions;

public class NotFoundClinicalExaminationsExeptions extends RuntimeException{
    public NotFoundClinicalExaminationsExeptions(){
        super("Nenhum Exame Clínico encontrado!!");
    }
}
