package springconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import modelspringenviroment.Adress;
import modelspringenviroment.Employee;


@Configuration
//@ComponentScan(basePackages="modelspringenviroment")
@PropertySource(value="information.properties")//olusturdu�umuz propertiesten bilgileri cekece�iz
public class SpringCongfiguration {
	
	@Autowired
	private Environment environment;//bu s�n�f yard�m�zla propertiesteki bilgilere eri�ece�iz.
	
	@Bean
	public Employee getEmployee(){
		Employee emp=new Employee();
		String name=environment.getProperty("name");
		String surname=environment.getProperty("surname");
		emp.setName(name);
        emp.setSurname(surname);
        
		
		return new Employee();
	}
	@Bean
	public Adress getAdress(){
		Adress adress=new Adress();
		adress.setCountry("T�rkiye");
		adress.setCity("Trabzon");
	   return adress;
	}
	
	

}
