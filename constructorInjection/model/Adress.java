package model;

public class Adress {
	
	private String country;
	private String city;

	public Adress() {
		super();
	}
	public Adress(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adress [country=" + country + ", city=" + city + "]";
	}
	
		

}
