package com.invoice.webservices.repo;

import com.invoice.webservices.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository <UserDetails, Long> {
//    Boolean existsByEmail(String email);
//    Boolean existsByPassword(String password);
    UserDetails findUserDetailsByUsernameAndPassword(String username, String password);
}
