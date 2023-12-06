package com.ulbra.tdeaula20.exceptions;

import com.ulbra.tdeaula20.erro.ErroResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class HandleCustomExceptions {

    @ExceptionHandler(NotFoundClientExceptions.class)
    public ResponseEntity<ErroResponseDTO> handleNotFoundBookException(NotFoundClientExceptions exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErroResponseDTO(exception.getMessage(), new ArrayList<>()));
    }
}
