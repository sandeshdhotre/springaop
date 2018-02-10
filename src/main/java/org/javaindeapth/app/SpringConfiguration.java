package org.javaindeapth.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.javaindeapth")
public class SpringConfiguration {

	@Bean("e1")
	public Employee createEmployee() {
		Employee e1 = new Employee(1,"Employee1");
		return e1;
	}
}
