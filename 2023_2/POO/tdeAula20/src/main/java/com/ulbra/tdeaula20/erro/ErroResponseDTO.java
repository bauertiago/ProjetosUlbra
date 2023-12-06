package com.ulbra.tdeaula20.erro;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ErroResponseDTO {

    public ErroResponseDTO(String message, List<String> erros) {
        this.message = message;
        this.erros = erros;
    }

    private String message;
    private List<String> erros;
    private LocalDateTime dateTime = LocalDateTime.now();
}
