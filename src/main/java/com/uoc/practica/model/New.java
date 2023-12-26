package com.uoc.practica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.*;

@Entity(name = "news")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class New {
    @Id
    private Long id;
    private String title;
    private String body;
    private LocalDateTime dateTime;
}
