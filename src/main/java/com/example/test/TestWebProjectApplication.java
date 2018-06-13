package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class TestWebProjectApplication extends WebMvcConfigurerAdapter{
  
	public static void main(String[] args) {
		SpringApplication.run(TestWebProjectApplication.class, args);
	}

	@Bean
  public MessageSource messageSource () {
      ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
      messageSource.setBasename("message");
      return messageSource;
  }

}
