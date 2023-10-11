package com.bookstore.BookStoreApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookStoreAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BookStoreAppApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(BookStoreAppApplication.class);
	}
	@RequestMapping(value = "/hello")
	public String greetingMessage(){
		return "Hello, welcome Saul";
	}

}
