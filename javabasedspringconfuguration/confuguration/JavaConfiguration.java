package confuguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//bu sýnýf içerisinde bir yada birden fazla bean tanýmý var anlamýna gelir....
@Configuration

public class JavaConfiguration {
	
		
		@Bean
		public Employee createEmployee(){
			Employee employee=new Employee();
		    employee.setName("Suleyman");
		    employee.setSurname("Zengin");
		    return employee;

	}

}
