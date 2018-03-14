package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.EmployeeServiceImp;
import stereotypemodel.Employee;

public class TestStreotypeSpring {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("sterotype.xml"); 
		EmployeeServiceImp service=context.getBean("employeeServiceImp",EmployeeServiceImp.class);
        Employee employee=new Employee();
        employee.setName("asd");
        employee.setSurname("adasd");
		service.insertEmployee(employee);
		
		
	}

}
