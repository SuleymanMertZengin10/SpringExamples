package modelautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String name;
	private String surname;
	
	@Autowired //çok kullanýlýr.constructora veya getter-setter gerek yok kendi halledecek
	@Qualifier(value="adress2")//eðer birden fazla bean tanýmlamasý varsa org.springframework.beans.factory.NoUniqueBeanDefinitionException
	//hatasýný almamak için bunu kullanýyoruz.
	private Adress adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", adress=" + adress + "]";
	}
	
	
	

	

}
