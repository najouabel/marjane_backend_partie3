package com.app.marjane_backend.Service.implementation;



import com.app.marjane_backend.Service.PromotionCategorieService;
import com.app.marjane_backend.entities.PromotionCategory;
import com.app.marjane_backend.repositories.PromotionCategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PromotionCategorieServiceImp implements PromotionCategorieService {

    private final PromotionCategorieRepository repository;


    @Override
    public boolean create(PromotionCategory Promotioncategory) {
        try {
            repository.save(Promotioncategory);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<PromotionCategory> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<PromotionCategory> readAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(PromotionCategory requestPromotionCategory) {
        Optional<PromotionCategory> categoryPromotion = repository.findById(requestPromotionCategory.getId());
        if (categoryPromotion.isPresent()) {
            repository.save(requestPromotionCategory);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        Optional<PromotionCategory> categoryPromotion = repository.findById(id);
        if (categoryPromotion.isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}