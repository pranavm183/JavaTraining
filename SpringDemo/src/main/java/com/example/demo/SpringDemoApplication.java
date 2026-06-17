package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.UserRepository;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User us = new User();
		us.setName("Raghav");
		us.setCity("Vellor");
		us.setStatus("Mentor");
		//User user1 = userRepository.save(us);
		//System.out.println(user1);
		
		User us2 = new User();
		us2.setName("Pranav");
		us2.setCity("Sangli");
		us2.setStatus("Developer");
		//User user2 = userRepository.save(us2);
		
		//System.out.println(user2);
	
		List<User> users=List.of(us,us2);
		
		
	}

}
