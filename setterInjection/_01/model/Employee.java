package _01.model;

public class Employee {
	
	private String name;
	private String surname;
	private int age;
	private Adress adress;//farklı bir bean bu sınıfıniçinde kullandık xml de nasıl yapılıyor bakınız(yine )
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

	
	//Xml sınıfı yardımıyla setter injection yapmak için get ve set metotlarınıolusturdu
    //default constructor olacak unutmayalım.
	
	
	
}
