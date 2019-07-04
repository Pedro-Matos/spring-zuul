package com.rho.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class InterviewApplication {

	//TODO Test The Routing
	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

}
