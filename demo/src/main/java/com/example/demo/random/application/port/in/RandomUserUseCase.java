package com.example.demo.random.application.port.in;

import com.example.demo.random.domain.User;

public interface RandomUserUseCase {

	User randomUser();
	User getUserBySeed(String seed);
}
