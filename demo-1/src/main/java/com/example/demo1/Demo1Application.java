package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Demo1Application.class, args);
		System.out.println("helooo");
		product p=con.getBean(product.class);
		p.setId(1);
		p.setName("earphones");
		p.setPrice(44.5f);
		System.out.println(p);
	}

}
