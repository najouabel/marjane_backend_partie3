package com.app.marjane_backend.Service;

import com.app.marjane_backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product creer(Product produit);

    List<Product> lister();

    Product modifier(Long id, Product produit);

    String supprimer(Long id);

    Optional<Product> findById(Long id);
}
