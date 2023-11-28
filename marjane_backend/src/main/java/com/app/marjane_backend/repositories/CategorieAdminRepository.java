package com.app.marjane_backend.repositories;

import com.app.marjane_backend.entities.CategorieAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieAdminRepository extends JpaRepository<CategorieAdmin, Long> {

}
