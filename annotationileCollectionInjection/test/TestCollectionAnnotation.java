package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelconstructorInjectionAnnotation.CollectionInjectionAnnotation;

public class TestCollectionAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("collectioninjectionannotatin.xml");	
		CollectionInjectionAnnotation example=   context.getBean("collectionInjectionAnnotation",CollectionInjectionAnnotation.class);	
	    System.out.println(example);
	}
}
