package com.mega.uwrite.uwriterestapi.repository;

import com.mega.uwrite.uwriterestapi.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
}
