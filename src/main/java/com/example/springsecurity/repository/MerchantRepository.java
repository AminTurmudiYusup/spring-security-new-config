package com.example.springsecurity.repository;

import com.example.springsecurity.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {
     Optional<Merchant> findByUserName(String userName);
}
