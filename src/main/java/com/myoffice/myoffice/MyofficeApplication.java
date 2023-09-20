package com.myoffice.myoffice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyofficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyofficeApplication.class, args);
	}
    @Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();	}
}
