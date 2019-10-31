package com.travel_stories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.travel_stories.entities.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})


public class TravelStoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelStoriesApplication.class, args);
	}

}
