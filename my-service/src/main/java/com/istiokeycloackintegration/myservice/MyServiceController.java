package com.istiokeycloackintegration.myservice;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MyServiceController {

	@GetMapping("/hello")
	private Mono<String> sayHello() {
		_log.info("Hello Request");
		return Mono.just("Hello!");
	}

	private static final Logger _log = LoggerFactory.getLogger(MyServiceController.class);

}
