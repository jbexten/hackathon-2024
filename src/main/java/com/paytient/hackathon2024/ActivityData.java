package com.paytient.hackathon2024;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ActivityData {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String memberId;
    private int steps;
    private LocalDate date;

    public ActivityData(String memberId, int steps, LocalDate date) {
        this.memberId = memberId;
        this.steps = steps;
        this.date = date;
    }

}
