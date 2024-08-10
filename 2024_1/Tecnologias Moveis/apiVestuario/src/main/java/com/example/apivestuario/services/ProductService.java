package com.example.apivestuario.services;

import com.example.apivestuario.dtos.ProductResponseDTO;
import com.example.apivestuario.entities.Product;
import com.example.apivestuario.exceptions.NotFoundProductExceptions;
import com.example.apivestuario.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductResponseDTO> getAllProducts(){
        List<ProductResponseDTO> productDTO = new ArrayList<>();

        List<Product> products = this.productRepository.findAll();
        if(products.isEmpty()){
            throw new NotFoundProductExceptions();
        }
        for(Product product : products){
            productDTO.add(new ProductResponseDTO(product.getName(),product.getPrice(),product.getDescription(),product.getNameImage()));
        }
        return productDTO;
    }

    public ProductResponseDTO createProduct(ProductResponseDTO productDTO){
        Product productReturn = this.productRepository.save(productDTO.convertDTOToProduct());

        return productDTO.convertProductToDTO(productReturn);
    }

    public Product updateProduct(long id, Product updatedProduct){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product newProduct = optionalProduct.get();
            newProduct.setName(updatedProduct.getName());
            newProduct.setPrice(updatedProduct.getPrice());
            newProduct.setDescription(updatedProduct.getDescription());
            newProduct.setNameImage(updatedProduct.getNameImage());

            return productRepository.save(newProduct);
        }
        throw new NotFoundProductExceptions();
    }

    public ResponseEntity<String> deleteProduct(long id){
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isPresent()){
            Product deletedProduct = optionalProduct.get();
            productRepository.delete(deletedProduct);
            return ResponseEntity.ok("Cliente deletado com sucesso");
        }
        return ResponseEntity.notFound().build();
    }

    public void deleteAll(){
        productRepository.deleteAll();
    }
}
