package com.mega.uwrite.uwriterestapi.repository;

import com.mega.uwrite.uwriterestapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
