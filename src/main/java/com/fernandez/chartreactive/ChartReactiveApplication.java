package com.fernandez.chartreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ChartReactiveApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ChartReactiveApplication.class, args);
	}

}
