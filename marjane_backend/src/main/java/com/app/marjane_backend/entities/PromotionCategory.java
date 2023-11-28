package com.app.marjane_backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "promotion_category")
public class PromotionCategory extends Promotion{
    @OneToOne
    private Category category;
}
