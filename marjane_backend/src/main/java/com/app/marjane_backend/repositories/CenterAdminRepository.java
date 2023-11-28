package com.app.marjane_backend.repositories;


import com.app.marjane_backend.entities.CenterAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterAdminRepository extends JpaRepository<CenterAdmin, Long> {


}
