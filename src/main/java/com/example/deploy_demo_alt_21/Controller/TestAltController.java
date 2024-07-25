package com.example.deploy_demo_alt_21.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deploy_demo_alt_21.Model.DTO.HelloAltResponse;

import io.micrometer.tracing.annotation.NewSpan;

@RestController
public class TestAltController {

	private static final Logger logger = LoggerFactory.getLogger(TestAltController.class);
	
	@GetMapping("/hello-alt")
	@NewSpan(value = "alt-span")
	public HelloAltResponse HelloAltResponse() {
		logger.info("Alt API call: Hello World");
		return new HelloAltResponse("Hello from ALT app");
	}
}
