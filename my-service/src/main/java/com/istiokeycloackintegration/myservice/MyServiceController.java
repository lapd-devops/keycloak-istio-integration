package com.istiokeycloackintegration.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MyServiceController {

	@GetMapping("/hello")
	private Mono<String> sayHello() {
		return Mono.just("Hello!");
	}

}
