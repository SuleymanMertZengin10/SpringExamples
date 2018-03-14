package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelcollection.Employee;

public class TestCollectionSping {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("collectioninjection.xml");
		Employee nameList=context.getBean("list1",Employee.class);
		System.out.println(nameList);
		
		System.out.println("---inject iþlemnden sonra---");
		Employee list2=context.getBean("list2",Employee.class);
		System.out.println(list2);
		
	}

}
