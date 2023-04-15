package com.mega.uwrite.uwriterestapi.repository;

import com.mega.uwrite.uwriterestapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    User findUserById(Long Id);
}
