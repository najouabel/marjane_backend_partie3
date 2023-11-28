package com.app.marjane_backend.web;

import com.app.marjane_backend.Service.implementation.SuperAdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generalAdmin")
public class SuperAdminController {
    private final SuperAdminServiceImp service;

    @Autowired
    public SuperAdminController(SuperAdminServiceImp superAdminServiceImp) {
        this.service = superAdminServiceImp;

    }

}
