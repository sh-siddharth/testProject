package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
/*(scanBasePackages={"com.example.*"})
@EnableJpaRepositories(basePackages= {"com.example.test.service"})
//@ComponentScan(basePackages = { "com.example.*" })
//@EntityScan("com.example.*") 
*/public class TestWebProjectApplication {
  
	public static void main(String[] args) {
		SpringApplication.run(TestWebProjectApplication.class, args);
	}


}
