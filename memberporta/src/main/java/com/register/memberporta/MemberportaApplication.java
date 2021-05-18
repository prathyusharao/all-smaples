package com.register.memberporta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages={
		"com.register.memberporta.service"})
@EnableDiscoveryClient
public class MemberportaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberportaApplication.class, args);
	}

}
