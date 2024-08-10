package com.example.apivestuario.exceptions;

import com.example.apivestuario.erro.ErroResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class HandleCustomExceptions {
    @ExceptionHandler(NotFoundProductExceptions.class)
    public ResponseEntity<ErroResponseDTO> handleNotFoundProductExceptions(NotFoundProductExceptions exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErroResponseDTO(exception.getMessage(), new ArrayList<>()));
    }
}
