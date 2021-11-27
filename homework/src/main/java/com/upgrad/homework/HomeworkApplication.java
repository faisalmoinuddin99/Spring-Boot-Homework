package com.upgrad.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(HomeworkApplication.class, args);
	DataSource source = context.getBean(DataSource.class) ;





		System.out.println("**********************************");
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(
				Arrays.stream(context.getBeanDefinitionNames())
						.collect(Collectors.toList())
						.contains("myService")
		);
		System.out.println("**********************************");
	}

}
