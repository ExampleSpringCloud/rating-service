package com.marcuschiu.ratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/ratings")
public class RatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

	private List<Rating> ratingList = Arrays.asList(
			new Rating(1L, 1L, 2),
			new Rating(2L, 1L, 3),
			new Rating(3L, 2L, 4),
			new Rating(4L, 2L, 5)
	);

	@GetMapping("/")
	public List<Rating> findAllRatings() {
		return ratingList;
	}
}
