package com.example.demo.random.application.port.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.random.application.port.in.RandomUserUseCase;
import com.example.demo.random.domain.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class RandomUserService implements RandomUserUseCase {

	private List<User> users;
	
	@Override
	public User randomUser() {
		
		User user = new User();
		user.generateUser();
		
		if ( null == users ) {
			users = new ArrayList<User>();
		}
		users.add(user);
		
		return user;
	}

	@Override
	public User getUserBySeed(String seed) {
		if ( null == users ) {
			return null;
		}
		List<User> usr = users.stream().filter( x -> x.getInfo().getSeed().equals(seed) ).collect(Collectors.toList());
		return usr.get(0);
	}

}
