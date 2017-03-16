package com.sogeti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerExampleApplication.class, args);
	}
	
}
