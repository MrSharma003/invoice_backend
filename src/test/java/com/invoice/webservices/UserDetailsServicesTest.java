package com.invoice.webservices;

import com.invoice.webservices.repo.UserDetailsRepository;
import com.invoice.webservices.services.UserDetailsServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserDetailsServicesTest {
    @Mock
    UserDetailsRepository userDetailsRepository;
    UserDetailsServices userDetailsServices;

    @BeforeEach
    void setUp() {
        this.userDetailsServices=new UserDetailsServices(this.userDetailsRepository);
    }

    @Test
    void getDetails() {
        userDetailsServices.getDetails("prashant","123");
        Mockito.verify(userDetailsRepository).findUserDetailsByUsernameAndPassword("prashant","123");
    }
}