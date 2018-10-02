package fr.hobbit.sharyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SharyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharyServerApplication.class, args);
	}
}
