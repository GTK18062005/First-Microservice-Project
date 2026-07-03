package com.example.demo.controller.Confriguation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class confriguation {
@Bean
public RestTemplate rest()
{
	return new RestTemplate();
}
}
