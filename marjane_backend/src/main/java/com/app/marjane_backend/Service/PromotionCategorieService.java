package com.app.marjane_backend.Service;


import com.app.marjane_backend.entities.PromotionCategory;

import java.util.List;
import java.util.Optional;

public interface PromotionCategorieService {
    boolean create(PromotionCategory Promotioncategory);

    Optional<PromotionCategory> read(Long id);

    List<PromotionCategory> readAll();

    boolean update(PromotionCategory requestPromotionCategory);

    boolean delete(Long id);
}
