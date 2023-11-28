package com.app.marjane_backend.Service.implementation;


import com.app.marjane_backend.Service.AdminService;
import com.app.marjane_backend.entities.CategorieAdmin;
import com.app.marjane_backend.repositories.CategorieAdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CategorieAdminServiceImp implements AdminService<CategorieAdmin> {
    private CategorieAdminRepository repository;

    @Override
    public CategorieAdmin create(CategorieAdmin administrator) {
        return repository.save(administrator);
    }

    @Override
    public String delete(Long id) {
        Optional<CategorieAdmin> administratorOptional = repository.findById(id);
        if (administratorOptional.isPresent()) {
            repository.deleteById(id);
            return "Center administrator deleted successfully";
        }
        return null;
    }
}

