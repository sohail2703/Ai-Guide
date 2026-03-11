package com.ai.aitoolguide.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.aitoolguide.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
Optional<User>findByEmail(String email);
}
