package com.bootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//Combination of 3 annotations - 
//@Configuration -- where it can define beans, 
//@EnableAutoConfiguration -- enabling autoConfiguration details
//@ComponentScan -- it is scanning the components from the basePackage
@SpringBootApplication
public class FirstBootProjectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FirstBootProjectApplication.class, args);
	}

}
