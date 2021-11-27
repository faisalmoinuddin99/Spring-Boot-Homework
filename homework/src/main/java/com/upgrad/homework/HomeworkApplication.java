package com.upgrad.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(HomeworkApplication.class, args);
	DataSource source = context.getBean(DataSource.class) ;
	}

}
