package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.PromotionProductService;
import com.app.marjane_backend.entities.PromotionProduct;
import com.app.marjane_backend.repositories.PromotionProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionProductServiceImp implements PromotionProductService {

    private final PromotionProductRepository repository;

    @Autowired
    public PromotionProductServiceImp(PromotionProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public PromotionProduct create(PromotionProduct promotionProduct) {
        return repository.save(promotionProduct);
    }

    @Override
    public PromotionProduct read(Long id) {
        Optional<PromotionProduct> productPromotionOptional = repository.findById(id);
        return productPromotionOptional.orElse(null);
    }

    @Override
    public List<PromotionProduct> readAll() {
        return repository.findAll();
    }

    @Override
    public PromotionProduct update(PromotionProduct promotionProduct) {
       return repository.save(promotionProduct);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
