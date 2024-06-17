package com.example.Outlet_Management;

import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OutletManagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OutletManagementApplication.class, args);
	}

}
