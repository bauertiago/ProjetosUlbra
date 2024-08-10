package com.example.apivestuario.erro;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ErroResponseDTO {
    private  String message;
    private List<String> erros;
    private LocalDateTime dataTime = LocalDateTime.now();
    public ErroResponseDTO(String message, List<String> erros){
        this.message = message;
        this.erros = erros;
    }
}
