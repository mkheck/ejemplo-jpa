package com.thehecklers.ejemplojpa;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@EnableScheduling
@Component
public class PollPlaneFinder {
    private WebClient client = WebClient.create("http://localhost:8080");
    private final AircraftRepository repository;

    public PollPlaneFinder(AircraftRepository repository) {
        this.repository = repository;

        //repository.deleteAll();
    }

    @Scheduled(fixedRate = 1000)
    private void pollPlanes() {
/*
		client.get()
				.retrieve()
				.bodyToFlux(Aircraft.class)
				.filter(plane -> !plane.getReg().isEmpty())
				.toStream()
				.forEach(repository::save);
*/
        System.out.println("--- All aircraft ---");
        repository.findAll().forEach(System.out::println);
    }
}
