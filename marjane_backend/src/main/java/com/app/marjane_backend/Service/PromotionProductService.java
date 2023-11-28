package com.app.marjane_backend.Service;



import com.app.marjane_backend.entities.PromotionProduct;

import java.util.List;

public interface PromotionProductService {
    PromotionProduct create(PromotionProduct PromotionProduct);
    PromotionProduct read(Long id);
    List<PromotionProduct> readAll();
    PromotionProduct update(PromotionProduct PromotionProduct);
    void delete(Long id);


}
