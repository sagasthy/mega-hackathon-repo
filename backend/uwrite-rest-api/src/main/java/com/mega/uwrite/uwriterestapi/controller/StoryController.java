package com.mega.uwrite.uwriterestapi.controller;

import com.mega.uwrite.uwriterestapi.exception.StoryNotFoundException;
import com.mega.uwrite.uwriterestapi.exception.UserNotFoundException;
import com.mega.uwrite.uwriterestapi.model.Story;
import com.mega.uwrite.uwriterestapi.model.User;
import com.mega.uwrite.uwriterestapi.repository.StoryRepository;
import com.mega.uwrite.uwriterestapi.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("stories")
public class StoryController {
    private final UserRepository userRepository;
    private final StoryRepository storyRepository;

    public StoryController(UserRepository userRepository, StoryRepository storyRepository) {
        this.userRepository = userRepository;
        this.storyRepository = storyRepository;
    }

    @GetMapping("/get-list/{userId}")
    public ResponseEntity<List<Story>> getStoriesByUserId(@PathVariable Long userId) {
        Optional<User> user = userRepository.findById(userId);

        if(user.isEmpty()) throw new UserNotFoundException("Invalid User ID");

        return ResponseEntity.ok().body(user.get().getStories());
    }

    @GetMapping("/get-story/{storyId}")
    public ResponseEntity<Story> getStoryById(@PathVariable Long storyId) {
        Optional<Story> story = storyRepository.findById(storyId);

        if(story.isEmpty()) throw new StoryNotFoundException("Invalid Story ID");

        return ResponseEntity.ok().body(story.get());
    }

    @PutMapping("/new-story")
    public ResponseEntity<Story> createStory(@RequestBody StoryRequest storyRequest) {
        Optional<User> user = userRepository.findById(storyRequest.userId());

        if(user.isEmpty()) throw new UserNotFoundException("Invalid User ID");

        User foundUser = user.get();
        Story story = Story.builder()
                .storyContent(storyRequest.content().getBytes(StandardCharsets.UTF_8))
                .publishedDate(Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)))
                .build();
        foundUser.getStories().add(story);

        Story savedStory = storyRepository.save(story);
        userRepository.save(foundUser);
        return ResponseEntity.ok().body(savedStory);
    }
}

record StoryRequest(Long userId, String content) {}
