package com.invoice.webservices.services;

import com.invoice.webservices.entity.UserDetails;
import com.invoice.webservices.repo.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServices {
    public UserDetailsServices(UserDetailsRepository userDetailsRepository){
        this.userDetailsRepository=userDetailsRepository;
    }
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    public UserDetails getDetails(String username, String password) {
        return userDetailsRepository.findUserDetailsByUsernameAndPassword(username,password);
    }
}
