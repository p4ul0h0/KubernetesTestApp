package io.github.p4ul0h0.k8stest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("FOI");
	}
}
