package com.app.marjane_backend.repositories;

import com.app.marjane_backend.entities.PromotionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface PromotionCategorieRepository extends JpaRepository<PromotionCategory, Long> {
}
