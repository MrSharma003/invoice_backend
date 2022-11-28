package com.invoice.webservices;

import com.invoice.webservices.entity.UserDetails;
import com.invoice.webservices.repo.UserDetailsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserDetailsRepositoryTest {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Test
    void findUserDetailsByUsernameAndPassword() {
        UserDetails actualResult = userDetailsRepository.findUserDetailsByUsernameAndPassword("prashant123", "kjahfchd");
        assertThat(actualResult).isNotNull();
    }
}