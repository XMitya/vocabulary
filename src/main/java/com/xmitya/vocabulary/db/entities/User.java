package com.xmitya.vocabulary.db.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Table("users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    UUID userId;
    String email;
    @ToString.Exclude
    String passwordHash;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Boolean active;
    String role;
}
