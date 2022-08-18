package com.example.springsecurity.services;

import com.example.springsecurity.entity.Merchant;
import com.example.springsecurity.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Merchant userDetails=merchantRepository.findByUserName(username).orElseThrow(
                () -> new UsernameNotFoundException("Not Found User")
        );

        return new org.springframework.security.core.userdetails.User(userDetails.getUserName(), userDetails.getPassword(), Collections.singletonList(new SimpleGrantedAuthority(userDetails.getRole())));
    }
}
