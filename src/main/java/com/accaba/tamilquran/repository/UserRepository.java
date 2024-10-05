package com.accaba.tamilquran.repository;

import com.accaba.tamilquran.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
