package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.AdminService;
import com.app.marjane_backend.entities.CenterAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/centerAdministrator")
public class CenterAdminController  {
    private final AdminService<CenterAdmin> centerAdminService;

    @Autowired
    public CenterAdminController(AdminService<CenterAdmin> centerAdminService) {
        this.centerAdminService = centerAdminService;
    }

    @PostMapping
    public ResponseEntity<CenterAdmin> create(@RequestBody CenterAdmin centerAdmin) {
        CenterAdmin createdAdministrator = centerAdminService.create(centerAdmin);
        return createdAdministrator != null ?
                new ResponseEntity<>(createdAdministrator, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCenterAdministrator(@PathVariable Long id) {
        String result = centerAdminService.delete(id);
        return result != null ?
                new ResponseEntity<>("Center administrator deleted successfully", HttpStatus.OK) :
                new ResponseEntity<>("Center administrator not found", HttpStatus.NOT_FOUND);
    }


}
