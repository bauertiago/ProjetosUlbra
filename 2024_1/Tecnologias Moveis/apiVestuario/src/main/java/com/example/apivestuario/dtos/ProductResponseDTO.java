package com.example.apivestuario.dtos;

import com.example.apivestuario.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {
    private String name;
    private String price;
    private String description;
    private String nameImage;

    public Product convertDTOToProduct(){
        return new Product(this.getName(), this.getPrice(), this.getDescription(), this.getNameImage());
    }
    public ProductResponseDTO convertProductToDTO(Product product){
        return new ProductResponseDTO(product.getName(), product.getPrice(), product.getDescription(), product.getNameImage());
    }
}
