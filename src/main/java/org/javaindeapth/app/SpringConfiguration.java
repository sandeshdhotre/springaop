package org.javaindeapth.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="org.javaindeapth")
@PropertySource(value= {"employee.properties"})
@EnableAspectJAutoProxy
public class SpringConfiguration {

	@Bean("e1")
	public Employee createEmployee() {
		Employee e1 = new Employee(1,"Employee1");
		return e1;
	}
	
	@Bean("e2")
	public Employee createEmployee2(@Value("${id}") int id,@Value("${name}") String name) {
		Employee e2 = new Employee(id,name);
		return e2;
	}
}
