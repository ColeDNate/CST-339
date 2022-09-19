package net.myschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"net.myschedule"})
@SpringBootApplication
public class Clc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Clc1Application.class, args);
	}

}
