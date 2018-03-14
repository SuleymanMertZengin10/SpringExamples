package modelspringenviroment;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String name;
	private String surname;
	
	@Autowired
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
