package com.primeiroprojeto.spring.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String mensagem() {
		return "Primeiro projeto spring-boot web";
	}
	
}
