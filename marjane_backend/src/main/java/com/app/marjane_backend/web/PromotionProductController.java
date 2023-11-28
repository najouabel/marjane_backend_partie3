package com.app.marjane_backend.web;


import com.app.marjane_backend.Service.implementation.PromotionManagerImp;
import com.app.marjane_backend.Service.implementation.PromotionProductServiceImp;
import com.app.marjane_backend.entities.PromotionProduct;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotion")

@AllArgsConstructor
public class PromotionProductController {
    private final PromotionProductServiceImp service;
    private final PromotionManagerImp observabl;
    private  final  CategorieAdminController adminController;

    @PostMapping
    public ResponseEntity<String> createProductPromotion(@RequestBody PromotionProduct promotionProduct) {

        PromotionProduct createdPromotionProduct = service.create(promotionProduct);
        if (createdPromotionProduct != null) {

            observabl.subscribe(adminController);
            observabl.notifyObservers();

            return new ResponseEntity<>("Success creating product promotion", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Something went wrong when creating product promotion", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PromotionProduct> getPromotionById(@PathVariable Long id) {
        PromotionProduct promotion = service.read(id);
        if (promotion != null) {
            return new ResponseEntity<>(promotion, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<PromotionProduct>> getAllPromotions() {
        List<PromotionProduct> promotions = service.readAll();
        return new ResponseEntity<>(promotions, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePromotion(@PathVariable Long id, @RequestBody PromotionProduct updatedPromotion) {
        updatedPromotion.setId(id);
        PromotionProduct result = service.update(updatedPromotion);

        if (result != null) {
            return new ResponseEntity<>("Promotion updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Promotion not found or failed to update", HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void deletepromotion(@PathVariable Long id) {
         service.delete(id);
    }



}
