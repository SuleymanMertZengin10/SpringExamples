package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import confuguration.Employee;
import confuguration.JavaConfiguration;

public class TestJavaBasedBean {
	public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Employee employee=contex.getBean(Employee.class);
	    System.out.println(employee);
	}

}
