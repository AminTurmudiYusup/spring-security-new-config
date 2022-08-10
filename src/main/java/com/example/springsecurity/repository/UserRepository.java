package com.example.springsecurity.repository;

import com.example.springsecurity.entity.Merchant;
import com.example.springsecurity.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<Merchant, Long> {
    public Optional<Merchant> findByUserName(String userName);
}
