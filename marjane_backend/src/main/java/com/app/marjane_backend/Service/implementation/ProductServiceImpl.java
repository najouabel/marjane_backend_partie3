package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.ProductService;
import com.app.marjane_backend.entities.Product;
import com.app.marjane_backend.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl  implements ProductService {

        private final ProductRepository productRepository;

        @Override
        public Product creer(Product produit) {
            return productRepository.save(produit);
        }

        @Override
        public List<Product> lister() {
            return productRepository.findAll();
        }

        @Override
        public Product modifier(Long id, Product product) {
            return productRepository
                    .findById(id)
                    .map(p-> {
                        p.setName(product.getName());
                        p.setBrand(product.getBrand());
                        p.setPrice(product.getPrice());
                        return productRepository.save(p);
                    }).orElseThrow(()-> new RuntimeException("Produit introuvable"));
        }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
        @Override
        public String supprimer(Long id) {
            productRepository.deleteById(id);
            return "Produit supprimé";
        }
}
