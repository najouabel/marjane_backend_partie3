package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.AdminService;
import com.app.marjane_backend.entities.SuperAdmin;
import com.app.marjane_backend.repositories.SuperAdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SuperAdminServiceImp implements AdminService<SuperAdmin> {
    private SuperAdminRepository repository;

    public SuperAdmin create(SuperAdmin superAdmin) {
        return repository.save(superAdmin);
    }

    public String delete(Long id) {
        Optional<SuperAdmin> administratorOptional = repository.findById(id);
        if (administratorOptional.isPresent()) {
            repository.deleteById(id);
            return "Center administrator deleted successfully";
        }
        return null;
    }
}
