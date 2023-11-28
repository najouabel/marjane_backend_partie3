package com.app.marjane_backend.Service.implementation;
import com.app.marjane_backend.Service.AdminService;


import com.app.marjane_backend.entities.CenterAdmin;
import com.app.marjane_backend.repositories.CenterAdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class CenterAdminServiceImp implements AdminService<CenterAdmin> {
    private CenterAdminRepository repository;

    public CenterAdmin create(CenterAdmin centerAdmin) {
        return repository.save(centerAdmin);
    }

    public String delete(Long id) {
        Optional<CenterAdmin> administratorOptional = repository.findById(id);
        if (administratorOptional.isPresent()) {
            repository.deleteById(id);
            return "Center administrator deleted successfully";
        }
        return null;
    }
}
