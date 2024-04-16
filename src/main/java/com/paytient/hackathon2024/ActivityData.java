package com.paytient.hackathon2024;

import jakarta.annotation.Nonnull;
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

    private @Nonnull String memberId;
    private int steps;
    private @Nonnull LocalDate date;

    public ActivityData(@Nonnull String memberId, int steps, @Nonnull LocalDate date) {
        this.memberId = memberId;
        this.steps = steps;
        this.date = date;
    }

}
