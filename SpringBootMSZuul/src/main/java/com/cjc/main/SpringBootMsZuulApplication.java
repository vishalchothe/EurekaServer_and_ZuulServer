package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringBootMsZuulApplication {

	public static void main(String[] args) {
		System.out.println("This is zuul server..");
		SpringApplication.run(SpringBootMsZuulApplication.class, args);
	}

}
