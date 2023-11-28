package com.app.marjane_backend.Service;

public interface AdminService<T> {
    T create(T administrator);
    String delete(Long id);
}


