package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelautowired.Employee;


public class TestAutowired {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowired.xml");		
		
		Employee employee=context.getBean("employee1",Employee.class);
		
		System.out.println(employee);
		//org.springframework.beans.factory.NoUniqueBeanDefinitionException birden fazla ise bu hata alýrnýt
		
		
		
	}

}
