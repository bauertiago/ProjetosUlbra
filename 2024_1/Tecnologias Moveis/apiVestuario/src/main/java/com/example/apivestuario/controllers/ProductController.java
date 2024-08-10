package com.example.apivestuario.controllers;

import com.example.apivestuario.dtos.ProductResponseDTO;
import com.example.apivestuario.entities.Product;
import com.example.apivestuario.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<Map<String, List<ProductResponseDTO>>> getAllProducts() {
        List<ProductResponseDTO> products = this.productService.getAllProducts();
        Map<String, List<ProductResponseDTO>> response = new HashMap<>();
        response.put("products", products);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ProductResponseDTO creatProduct(@RequestBody ProductResponseDTO bodyRequest){
        return this.productService.createProduct(bodyRequest);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product updatedProduct){
        return productService.updateProduct(id,updatedProduct);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable long id){
        ResponseEntity<String> response = productService.deleteProduct(id);
        return response;
    }

    @DeleteMapping("/all")
    public String deleteAll(){
        productService.deleteAll();
        return "Produtos deletados com sucesso";
    }
}
