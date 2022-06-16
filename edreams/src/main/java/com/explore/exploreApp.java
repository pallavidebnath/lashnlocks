package com.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.explore.*" })
public class exploreApp {

	public static void main(String[] args) {

		try {
			SpringApplication.run(exploreApp.class, args);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
