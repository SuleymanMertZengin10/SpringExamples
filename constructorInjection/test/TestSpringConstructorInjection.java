package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;

public class TestSpringConstructorInjection {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorinjection.xml");
	   Employee emp1= context.getBean("employee1",Employee.class);
	   Employee emp2= context.getBean("employee2",Employee.class);	
	   System.out.println(emp1);
	   System.out.println(emp2);

	   
	}

}
