package com.app.marjane_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "center_admin")
public class CenterAdmin extends Admin {
    private String ville;
}
