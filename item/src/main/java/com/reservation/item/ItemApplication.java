package com.reservation.item;

import com.reservation.item.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

	User user = User
			.builder()
			.firstName("Test")
			.lastName("Test2")
			.password("123123")
			.build();

}
