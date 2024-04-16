package com.paytient.hackathon2024;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
 class DataPreLoader {

    private static final Logger log = LoggerFactory.getLogger(DataPreLoader.class);

    @Bean
    CommandLineRunner initDatabase(ActivityDataRepository repository) {
        return args -> {
            log.info("Preloading {}", repository.saveAndFlush(new ActivityData("1", 1000, LocalDate.of(2024, 1, 1))));
            log.info("Preloading {}", repository.saveAndFlush(new ActivityData("1", 1001, LocalDate.of(2024, 1, 2))));
            log.info("Preloading {}", repository.saveAndFlush(new ActivityData("1", 1002, LocalDate.of(2024, 1, 3))));
            log.info("Preloading {}", repository.saveAndFlush(new ActivityData("1", 1003, LocalDate.of(2024, 1, 4))));
        };
    }
}
