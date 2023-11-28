package com.app.marjane_backend.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String brand;
    private float price;

    @OneToOne(mappedBy = "product")
    private PromotionProduct promotionProduct;
    @ManyToOne
    private Category category;

}
