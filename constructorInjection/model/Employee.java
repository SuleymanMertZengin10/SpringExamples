package model;

public class Employee {
	//setter injectionla yaptýðýmýz iþemi þimdi constructor injectionla yapacaðýz.
	private String name;
	private String surname;
	private int age;
	private Adress adress;	
	//default constructori unutma
	public Employee() {
		super();
	}
	public Employee(String name, String surname, int age, Adress adress) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adress = adress;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", adress=" + adress + "]";
	}


	
}
