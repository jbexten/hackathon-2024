package com.paytient.hackathon2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
public class ActivityDataController {

    private final ActivityDataRepository repository;

    public ActivityDataController(ActivityDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/activities")
    List<ActivityData> all() {
        return repository.findAll();
    }

    @PostMapping("/activities")
    ActivityData addActivity(@RequestBody ActivityData activityData) {
        return repository.save(activityData);
    }
}
