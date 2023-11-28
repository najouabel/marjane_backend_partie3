package com.app.marjane_backend;

import com.app.marjane_backend.Service.implementation.CenterAdminServiceImp;
import com.app.marjane_backend.entities.CenterAdmin;
import com.app.marjane_backend.repositories.CenterAdminRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CenterAdminServiceTest {

    @Mock
    private CenterAdminRepository repository;

    @InjectMocks
    private CenterAdminServiceImp service;

    @Test
    public void testCreateCenterAdministrator() {
        // Given
        CenterAdmin centerAdmin = new CenterAdmin();
        centerAdmin.setEmail("test@example.com");
        centerAdmin.setPassword("password123");

        // Mocking repository save method
        when(repository.save(centerAdmin)).thenReturn(centerAdmin);

        // When
        CenterAdmin createdAdministrator = service.create(centerAdmin);

        // Then
        assertEquals(centerAdmin.getEmail(), createdAdministrator.getEmail());
        assertEquals(centerAdmin.getPassword(), createdAdministrator.getPassword());
        verify(repository, times(1)).save(centerAdmin);
    }

}
