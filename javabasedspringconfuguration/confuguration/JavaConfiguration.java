package confuguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//bu s�n�f i�erisinde bir yada birden fazla bean tan�m� var anlam�na gelir....
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
