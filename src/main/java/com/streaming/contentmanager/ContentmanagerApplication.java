package com.streaming.contentmanager;

import com.streaming.contentmanager.model.Role;
import com.streaming.contentmanager.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ContentmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentmanagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner setupRoles(RoleRepository roleRepository) {
		return (args) -> {
			Role userRole = new Role(1,"USER", "USER");
			Role adminRole = new Role(2,"ADMIN", "ADMIN");

			roleRepository.save(userRole);
			roleRepository.save(adminRole);
		};
	}



}
