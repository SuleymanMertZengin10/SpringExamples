package _01.model;

public class Employee {
	
	private String name;
	private String surname;
	private int age;
	private Adress adress;//farkl� bir bean bu s�n�f�ni�inde kulland�k xml de nas�l yap�l�yor bak�n�z(yine )
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

	
	//Xml s�n�f� yard�m�yla setter injection yapmak i�in get ve set metotlar�n�olusturdu
    //default constructor olacak unutmayal�m.
	
	
	
}
