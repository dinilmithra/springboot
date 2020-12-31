package com.dm.sbwithhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbWithHibernateApplication.class, args);
		System.out.println("Started Spring boot With Hibernate");
	}

}
