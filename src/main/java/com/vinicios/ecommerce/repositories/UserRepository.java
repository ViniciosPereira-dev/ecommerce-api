package com.vinicios.ecommerce.repositories;

import com.vinicios.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
