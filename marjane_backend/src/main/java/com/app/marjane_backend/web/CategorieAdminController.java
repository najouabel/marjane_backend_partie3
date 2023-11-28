package com.app.marjane_backend.web;


import com.app.marjane_backend.Service.Observable;
import com.app.marjane_backend.Service.Observer;
import com.app.marjane_backend.Service.implementation.CategorieAdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departmentAdmin")
public class CategorieAdminController implements Observer {
    private CategorieAdminServiceImp service;

    @Autowired
    public CategorieAdminController(CategorieAdminServiceImp categorieAdminServiceImp) {
        this.service = categorieAdminServiceImp;
    }


    @Override
    public void update(int state) {
        System.out.println("hy admin we have new promotion");
    }
}
