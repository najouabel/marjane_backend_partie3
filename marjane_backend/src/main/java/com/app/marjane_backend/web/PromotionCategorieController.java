package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.PromotionCategorieService;
import com.app.marjane_backend.entities.PromotionCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/promotionCategorie")
public class PromotionCategorieController {

    private final PromotionCategorieService promotionService;

    @Autowired
    public PromotionCategorieController(PromotionCategorieService promotionService) {
        this.promotionService = promotionService;
    }

    }

