package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathService {
	
	@GetMapping("/add")
	public int add() {
		return 2 + 3;
	}
}