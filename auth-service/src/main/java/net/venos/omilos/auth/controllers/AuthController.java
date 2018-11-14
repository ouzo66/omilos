package net.venos.omilos.auth.controllers;

import net.venos.omilos.auth.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring.lemon.LemonController;

@RestController
@RequestMapping(AuthController.BASE_URI)
public class AuthController extends LemonController<User, Long> {
	
	public static final String BASE_URI = "/api/core";

}