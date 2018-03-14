package _01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _01.model.Employee;

public class TestSetterInjection {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("setterinjection.xml");
		Employee employee=context.getBean("employee1",Employee.class);
		System.out.println("farklý bean inject etmeden employee");
		System.out.println(employee);
		System.out.println("adress beaninin inject ettikten sonra employee lar");
		
		Employee employee3=context.getBean("employee3",Employee.class);
		Employee employee4=context.getBean("employee4",Employee.class);
		System.out.println(employee3);
		System.out.println(employee4);
		
		
		
	
	}

}
