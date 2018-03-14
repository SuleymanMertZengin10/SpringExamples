package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import modelspringenviroment.Employee;
import springconfiguration.SpringCongfiguration;

public class TestEnviroment {
	public static void main(String[] args) {
	 ApplicationContext context=new AnnotationConfigApplicationContext(SpringCongfiguration.class);
	 Employee emp=context.getBean(Employee.class);
	           System.out.println(emp);
	}

}
