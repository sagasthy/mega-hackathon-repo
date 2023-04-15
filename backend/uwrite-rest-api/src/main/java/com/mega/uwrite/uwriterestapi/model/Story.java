package com.mega.uwrite.uwriterestapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "stories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Story {
    @Id
    private Long id;
    private byte[] storyContent;
    private Timestamp publishedDate;
}
