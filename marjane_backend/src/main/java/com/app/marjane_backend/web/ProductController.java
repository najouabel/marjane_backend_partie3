package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.ProductService;
import com.app.marjane_backend.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.creer(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,@RequestBody Product product) {
        return productService.modifier(id, product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.findById(id);
        return product.map(p -> new ResponseEntity<>(p, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return productService.supprimer(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.lister();
    }

}
