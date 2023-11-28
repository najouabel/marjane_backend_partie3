package com.app.marjane_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "super_admin")
public class SuperAdmin extends Admin {
}
