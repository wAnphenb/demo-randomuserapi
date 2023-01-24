package com.example.demo.random.adapter.in.web;

import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.WebAdapter;
import com.example.demo.random.application.port.in.RandomUserUseCase;
import com.example.demo.random.domain.User;
import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RandomUserController {

	private final RandomUserUseCase randomUserUseCase;

	@GetMapping(path = {"/api"}, produces = MediaType.APPLICATION_JSON_VALUE)
	String getUser ( @RequestParam(required = false) String seed ) {
		System.out.println("seed: " + seed);
		User user = null;
		if ( null != seed ) {
			user = randomUserUseCase.getUserBySeed( seed );
		} else {
			user = randomUserUseCase.randomUser();
		}
		return new Gson().toJson(user);
	}
}
